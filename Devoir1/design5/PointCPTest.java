import java.io.*;

/**
 * This class prompts the user for a set of coordinates, and then 
 * converts them from polar to cartesian or vice-versa.

 * @author Simon Desjardins
 * @author 

 */
public class PointCPTest
{
  
  public static void main(String[] args)
  {
    
    PointCP2 point2;

    PointCP3 point3;

    System.out.println("Cartesian-Polar Coordinates Conversion Program");

    // Check if the user input coordinates from the command line
    // If he did, create the PointCP object from these arguments.
    // If he did not, prompt the user for them.
    try 
    {
      point2 = new PointCP2(Double.valueOf(args[0]).doubleValue(), 
        Double.valueOf(args[1]).doubleValue());
      point3 = new PointCP3(Double.valueOf(args[0]).doubleValue(), Double.valueOf(args[1]).doubleValue());
    }
    catch(Exception e)
    {
      // If we arrive here, it is because either there were no
      // command line arguments, or they were invalid
      if(args.length != 0)
        System.out.println("Invalid arguments on command line");

      try
      {
        point2 = getInput2();
        
        point3 = getInput3();
        
      }
      catch(IOException ex)
      {
        System.out.println("Error getting input. Ending program.");
        return;
      }
    }
    
    String out = new String(); //on cree un nouveau objet string pour display nos methode toString des objets de PointCP2 et PointCP3
    out = point2.toString();
    System.out.print(out);
    
    out = point3.toString();
    System.out.print(out);



  }

  /**
   * This method obtains input from the user and verifies that
   * it is valid.  When the input is valid, it returns a PointCP
   * object.
   *
   * @return A PointCP constructed using information obtained 
   *         from the user.
   * @throws IOException If there is an error getting input from
   *         the user.
   */
  private static PointCP2 getInput2() throws IOException
  {
    byte[] buffer = new byte[1024];  //Buffer to hold byte input
    boolean isOK = false;  // Flag set if input correct
    String theInput = "";  // Input information
    
    double a = 0.0;
    double b = 0.0;

    // Allow the user to enter the three different arguments
    for (int i = 0; i < 2; i++)
    {
      while (!(isOK))
      {
        isOK = true;  //flag set to true assuming input will be valid
          
  
        if(i ==0){
          System.out.print("Enter Rho value: "); //pour le premier argument
        }
        else{
          System.out.print("Enter Theta value: "); //pour le deuxieme argument
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
            a = Double.valueOf(theInput).doubleValue(); //On mais la valeur obtenue du premier argument dans un double a qui va etre le Rho value
            
            
          }
          else  // Second and third arguments
          {
            b = Double.valueOf(theInput).doubleValue(); //On mais la valeur obtenue du deuxieme argument dans un double a qui va etre le Theta value
            
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
    return (new PointCP2(a, b)); //retorune un object PointCP2 car on ne peu pas retourner un objet d'une class abstract
  }

  private static PointCP3 getInput3() throws IOException
  {
    byte[] buffer = new byte[1024];  //Buffer to hold byte input
    boolean isOK = false;  // Flag set if input correct
    String theInput = "";  // Input information
    
    double a = 0.0;
    double b = 0.0;

    // Allow the user to enter the three different arguments
    for (int i = 0; i < 2; i++)
    {
      while (!(isOK))
      {
        isOK = true;  //flag set to true assuming input will be valid
          

        if(i ==0){
          System.out.print("Enter x value: "); //pour le premier argument
        }
        else{
          System.out.print("Enter y value: ");//pour le deuxieme argument
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
            a = Double.valueOf(theInput).doubleValue();  //On mais la valeur obtenue du premier argument dans un double a qui va etre le X value
            
            
          }
          else  // Second and third arguments
          {
            b = Double.valueOf(theInput).doubleValue(); //On mais la valeur obtenue du deuxieme argument dans un double a qui va etre le Y value
            
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
    return (new PointCP3(a, b)); //retorune un object PointCP3 car on ne peu pas retourner un objet d'une class abstract
  }

}
