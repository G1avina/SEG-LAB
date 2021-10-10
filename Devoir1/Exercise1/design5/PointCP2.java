// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

/**
 * This class contains instances of coordinates in either
 * cartesian format.  
 *
 * @author Simon Desjardins;
 * @author 
 * @version October 2021
 */
public class PointCP2 extends PointCP5
{
    
  //Instance variables ************************************************
    


  /**
   * Contains the current value of RHO of the Polar format.
   */
  //private double xOrRho;
  
  /**
   * Contains the current value of Theta of the Polar format.
   */
  //private double yOrTheta;

  // private char typeCoord;
	
  
  //Constructors ****************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  
  public PointCP2(double xOrRho, double yOrTheta) { //On cree une valuers 
    super(xOrRho, yOrTheta);

    
  } 
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
      return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
  }
  
  public double getY()
  {
      return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
  }
  
  public double getRho()
  {
   
      return xOrRho;
  }
  
  public double getTheta()
  {
      return yOrTheta;
  }
  

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP2 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP2 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP2('C',
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString() //on prend les valeurs obtennue du getRho et getTheta (valeurs stocker) et on calcule a la demande les valeurs x and y pour les points cartesian
  {
    return "Stored as Polar  (" + getRho() + "," + getTheta() + ")" +
       " with corresponding Cartesian (" + getX() + "," + getY() + ")" + "\n";
  }
}