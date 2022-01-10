public class Tarbooz extends Melon
{
	public Tarbooz(double weight, double antiOxidentAmount)
	{
		super(weight, antiOxidentAmount);	
	}
	
	public String toString()
	{
		return String.format("Kharbooz%n\tWeight %s%s",  super.toString());
	}
}