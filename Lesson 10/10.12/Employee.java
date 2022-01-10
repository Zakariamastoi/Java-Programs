public abstract class Employee
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDay;

	// constructor
	public Employee(String firstName, String lastName, 
	String socialSecurityNumber, int month, int day, int year)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		birthDay = new Date(month, day, year);
	} 
	
	// return first name
	public String getFirstName()
	{
		return firstName;
	} 
	
	// return last name
	public String getLastName()
	{
		return lastName;
	} 
	
	// return social security number
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	} 
	public Date getBirthday()
	{
        return this.birthDay;
    }
	
	@Override
	public String toString()
	{
		return String.format("%s %s%nsocial security number: %s", 
		getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	
	// abstract method must be overridden by concrete subclasses
	public abstract double earnings(); // no implementation here
   
}