//  Rectangle.java

public class Rectangle extends TowdShape
{
	private double length;
	private double wirth;

	// constructor
	public Rectangle( double length, double wirth)
	{
		super(); 
		this.length = length;
		this.wirth = wirth;
	}

	public void setLength(double length)
	{
	 this.length = length;
	} 

	public double getLength()
	{
	 return length;
	}
	
	public void setWirth(double wirth)
	{
	 this.wirth = wirth;
	} 

	public double getWirth()
	{
	 return wirth;
	}
	
	@Override 
	public double getArea()
	{
	return length * wirth;
	}
	
}  // end class Rectangle