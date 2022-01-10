public class Malta extends Citrus
{
	public Malta(double weight, double vitCAmount)
	{
		super(weight, vitCAmount);	
	}
	
	public String toString()
	{
		return String.format("Kinu%n\tWeight %s%s",   super.toString());
	}
}