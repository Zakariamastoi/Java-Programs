// Finds area for square

public class Square extends TowdShape{
    
    private double length; 
    
    // constructor
    public Square(double length)
    {    
        this.length = length;
    } 
	
    public void setLength(double length)
    {
        this.length = length;
    } 
	
    public double getLength()
    {
        return length;
    } 
	
    @Override
    public double getArea()
    {
        return getLength() * getLength();
    }
} // end class Square