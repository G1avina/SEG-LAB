//Simon Desjardins 300172226 - SEG2505 design 5

public abstract class PointCP5
{
    double xOrRho;
    double yOrTheta;
    


  public PointCP5(double xOrRho, double yOrTheta){

    this.xOrRho = xOrRho;
    this.yOrTheta = yOrTheta;
    
  }

 
  public abstract double getX();

  
  public abstract double getY();

  
  public abstract double getRho();

  
  public abstract double getTheta();

  // public abstract void convertStorageToPolar();
	

  // public abstract void convertStorageToCartesian();

  public abstract double getDistance(PointCP5 pointB);

  public abstract PointCP5 rotatePoint(double rotation);
  public abstract String toString();

}