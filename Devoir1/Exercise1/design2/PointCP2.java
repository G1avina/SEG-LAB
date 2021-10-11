


/**

 *
 * @author Simon Desjardins

 */
public class PointCP2
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
 
  
  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  private double xOrRho;
  
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  private double yOrTheta;
	
  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP2( double xOrRho, double yOrTheta)
  {
 
    this.xOrRho = xOrRho;
    this.yOrTheta = yOrTheta;
    
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
	
 
  public double getDistance(PointCP2 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  public PointCP2 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP2(
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as Polar  (" + getRho() + "," + getTheta() + ")" +
    " with corresponding Cartesian (" + getX() + "," + getY() + ")" + "\n";
  }
}
