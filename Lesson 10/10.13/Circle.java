//  Circle.java

public class Circle extends TowdShape
{
	private double radius; 
	private double  pai = 3.14; 

	// constructor
	public Circle(double radius)
	{
		super();
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
	
	@Override 
	public double getArea()
	{
		return  pai*(double)(Math.pow(radius, 2));
	}
}   // end class Circle