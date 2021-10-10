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
public class PointCP3 extends PointCP5
{

  //Constructor de la classe de PointCP3

  public PointCP3(double xOrRho, double yOrTheta)
  {
    super(xOrRho, yOrTheta);
    
  }
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
      return xOrRho;
  }
  
  public double getY()
  {
      return yOrTheta;
  }
  
  public double getRho()
  {
   
      return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
  }
  
  public double getTheta()
  {
      return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
  }
  

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP5 pointB)
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
  public PointCP3 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP3('C',
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString() //vice versa du design 2 
  {
    return "Stored as Cartesian  (" + getX() + "," + getY() + ")" +
       " with corresponding Polar (" + getRho() + "," + getTheta() + ")" + "\n";
  }
}