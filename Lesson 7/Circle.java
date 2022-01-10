// CommondLine 
public class Circle
{
	private int radius;
	private double area;
	private double circum;
	private double pi= 3.14;
	private double average;

	//constructor
	public Circle(int radius)
	{
		this.radius = radius;	
	}
	
	// setter
	public void setRadius(int radius)
	{ 
		this.radius = radius;
	}
	
	// getters
	public int getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return area = pi*(radius*radius);
	}
	
	public double getCircum()
	{
		return circum = 2.0*(pi*radius);
	}
	
	public static double getAreaAverage(Circle[] setOfArea)
	{
		int total = 0;
		
		for(Circle tArea : setOfArea)
			total += tArea.getArea();
		
		return(double)total/setOfArea.length;
	}
	
	public static double getCircumAverage(Circle[] setOfCircum)
	{
		int total = 0;
		
		for(Circle tCircum : setOfCircum)
			total += tCircum.getCircum();
		
		return(double)total/setOfCircum.length;
	}
}