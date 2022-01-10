//  Triangle.java

public class Triangle extends TowdShape
{
	private double berith;
	private double height;
	
	// constructor
	public Triangle(double berith, double height)
	{
	super();
	this.berith = berith;
	this.height = height;
	} 

	public void setBerith(double berith)
	{
		this.berith = berith;
	} 

	public double getBerith()
	{
	return berith;
	} 
	
	public void setHeight(double height)
	{
		this.height = height;
	} 

	public double getHeight()
	{
	return height;
	}
	
	
	@Override 
	public double getArea()
	{	
	return ((berith * height) / 2);
	}
}   // end class Triangle