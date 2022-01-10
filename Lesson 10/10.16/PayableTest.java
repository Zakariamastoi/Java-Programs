// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayableTest
{
	public static void main(String[] args)
	{
		Payable[] payableObjects = new Payable[4];

		// populate array with objects that implement Payable
		payableObjects[0] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00); 
		payableObjects[1] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		payableObjects[2] = new CommissionEmployee( 
		 "Sue", "Jones", "333-33-3333", 10000, .06); 
		payableObjects[3] = new BasePlusCommissionEmployee( 
		 "Bob", "Lewis", "444-44-4444", 5000, .04, 300);
		
		System.out.printf("Employees processed polymorphically:%n%n");

		// generically process each element in array employees
		for (Payable currentPayable : payableObjects)
		{
			System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount()); // invokes toString
		}
	}
}