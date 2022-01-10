 // PieceWorker.java

public class PieceWorker extends Employee
{
	private double wage;
	private double pieces;
	// constructor
	public PieceWorker(String firstName, String lastName, 
	String socialSecurityNumber, double wage, double pieces)
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if (wage < 0.0)
		throw new IllegalArgumentException(
		"Hourly wage must be >= 0.0");

		this.wage = wage;
		if(pieces >= 0.0)
            this.pieces = pieces;
        else
            throw new IllegalArgumentException(
            "Pieces must be >= 0.0");
	}
	
	// set wage
	public void setWage(double wage)
	{
		if (wage >= 0.0) // validate wage
		throw new IllegalArgumentException(
		"Hourly wage must be >= 0.0");

		this.wage = wage;
	} 

	// return wage
	public double getWage()
	{
		return wage;
	} 
	
	// set wage
	public void setPieces(double pieces)
	{
		if(pieces >= 0.0)
            this.pieces = pieces;
        else
            throw new IllegalArgumentException(
            "Pieces must be >= 0.0");
	} 

	// return wage
	public double getPieces()
	{
		return pieces;
	}

	@Override 
	public double earnings()
	{
		return getWage() * getPieces();
	}
	
	@Override 
	public String toString() 
	{ 
		 return String.format("PiceWorker employee: %s%n%s: $%,.2f; %s: %,.2f",
		 super.toString(), "hourly wage", getWage(), 
		 "wage per pieces", getPieces()); 
	} 
}
