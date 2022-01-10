// Calculates surface area and volume for sphere

public class Sphere extends ThreedShape
{
    
    private double radius; // radius of sphere
    
    // constructor
    public Sphere(double radius)
    {
        this.radius = radius;
    } 
	
    public void setRadius(double radius)
    {
        this.radius = radius;
    } 
	
    public double getRadius()
    {
        return radius;
    }
	
   // @Override
    public double getArea()
    {
        return getRadius() * getRadius() * 4 * Math.PI;
    } 
	
    // @Override
    public double  getVolume()
    {
        return (getRadius() * getRadius() * getRadius() * Math.PI * 4) / 3;
    } 
} // end class Sphere