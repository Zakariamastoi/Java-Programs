public class PieceWorker extends Employee
{
    private double wage;
    private double pieces;

    // constructor
    public PieceWorker(String firstName, String lastName, 
	String socialSecurityNumber,double wage, double pieces, int month, int day, int year)
	{
        super(firstName, lastName, socialSecurityNumber, month, day, year);

        setWage(wage);
        setPieces(pieces);
    }
	
	// set wage
	public void setWage(double wage)
	{
		if(wage >= 0.0)
            this.wage = wage;
        else
            throw new IllegalArgumentException("Wage must be >= 0.0");
	} 

	// return wage
	public double getWage()
	{
		return wage;
	} 
	
	// set pieces
	public void setPieces(double pieces)
	{
		if(pieces >= 0.0)
            this.pieces = pieces;
        else
            throw new IllegalArgumentException("Pieces must be >= 0.0");
	} 

	// return pieces
	public double getPieces()
	{
		return pieces;
	}

    // calculate earnings; override abstract method in Employee
    @Override
    public double earnings()
	{
        return getPieces() * getWage();
    }
    // String representation of object
    @Override
    public String toString(){
        return String.format("piece worker: %s\n%s: $%,.2f; %s: %,.2f",
            super.toString(), "wage", getWage(),
            "pieces produced", getPieces());
    }
}