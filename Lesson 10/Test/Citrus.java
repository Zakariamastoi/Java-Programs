public abstract class Citrus extends Fruit
{
	private double vitCAmount;
	 
	public Citrus(double weight, double vitCAmount)
	{
		super(weight);
		this.vitCAmount = vitCAmount;
	}
	 
	public double getVitCAmount ()
	{
		return vitCAmount;
	}
	 
	@Override
	public String toString()
	{
		return String.format("Vitaman C %.2f %s", super.toString(), getVitCAmount());
		
	}
}