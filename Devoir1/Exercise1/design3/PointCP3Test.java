
import java.io.*;

/**
 * This class prompts the user for a set of coordinates, and then 
 * converts them from polar to cartesian or vice-versa.
 *
 * @author Simon Desjardins
 */
 
public class PointCP3Test
{
  //Class methods *****************************************************


  public static void main(String[] args)
  {
    PointCP3 point;

    System.out.println("Cartesian-Polar Coordinates Conversion Program");

    // Check if the user input coordinates from the command line
    // If he did, create the PointCP object from these arguments.
    // If he did not, prompt the user for them.
    try
    {
      point = new PointCP3( 
        Double.valueOf(args[0]).doubleValue(), 
        Double.valueOf(args[1]).doubleValue());
    }
    catch(Exception e)
    {
      // If we arrive here, it is because either there were no
      // command line arguments, or they were invalid
      if(args.length != 0)
        System.out.println("Invalid arguments on command line");

      try
      {
        point = getInput();
      }
      catch(IOException ex)
      {
        System.out.println("Error getting input. Ending program.");
        return;
      }
    }

    String out = new String();
    out = point.toString();
    System.out.print(out);
   
  }


  private static PointCP3 getInput() throws IOException
  {
    byte[] buffer = new byte[1024];  //Buffer to hold byte input
    boolean isOK = false;  // Flag set if input correct
    String theInput = "";  // Input information
    
    //Information to be passed to the constructor
    
    double a = 0.0;
    double b = 0.0;

    // Allow the user to enter the three different arguments
    for (int i = 0; i < 2; i++)
    {
      while (!(isOK))
      {
        isOK = true;  //flag set to true assuming input will be valid
          
        // Prompt the user
        if (i == 0) // First argument - type of coordinates
        {
          System.out.print("Enter x value: ");
        }
        else // Second and third arguments
        {
          System.out.print("Enter y value: ");
        }

        // Get the user's input      
       
        // Initialize the buffer before we read the input
        for(int k=0; k<1024; k++)
        	buffer[k] = '\u0020';        
             
        System.in.read(buffer);
        theInput = new String(buffer).trim();
        
        // Verify the user's input
        try
        {
          if (i == 0) // First argument -- type of coordinates
          {
              a = Double.valueOf(theInput).doubleValue();
          }
          else  // Second and third arguments
          {
            //Convert the input to double values
              b = Double.valueOf(theInput).doubleValue();
          }
        }
        catch(Exception e)
        {
        	System.out.println("Incorrect input");
        	isOK = false;  //Reset flag as so not to end while loop
        }
      }

      //Reset flag so while loop will prompt for other arguments
      isOK = false;
    }
    //Return a new PointCP object
    return (new PointCP3( a, b));
  }
}
