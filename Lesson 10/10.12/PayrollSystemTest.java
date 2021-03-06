import java.util.Calendar;

public class PayrollSystemTest{
    public static void main(String[] args)
	{
        int currentMonth = 1 + Calendar.getInstance().get(Calendar.MONTH);

        // create four element Employee array
        Employee[] employees = new Employee[4];

        // initialise array with Employees
        employees[0] = new SalariedEmployee(
            "John", "Smith", "111-11-1111", 800.0, 11, 3, 1883);
        employees[1] = new HourlyEmployee(
            "Karen", "Price", "222-22-2222", 16.75, 40.0, 12, 12, 1975);
        employees[2] = new CommissionEmployee(
            "Sue", "Jones", "333-33-3333", 10000.0, .06, 12, 13, 1965);
        employees[3] = new BasePlusCommissionEmployee(
            "Bob", "Lewis", "444-44-4444", 5000.0, .04, 300.0, 12, 12, 1956);

        System.out.println("Employees processed polymorphically:\n");

        for(Employee currentEmployee : employees)
		{
            System.out.println(currentEmployee);

            // determine whether element is a BasePlusCommissionEmployee
            if(currentEmployee instanceof BasePlusCommissionEmployee)
			{
                // downcase Employee reference to
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee =
                    (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f\n",
                    employee.getBaseSalary());
            }

            // add $100.0 if birth month is current
            System.out.printf("earned $%,.2f\n\n",
                (currentEmployee.getBirthday().getMonth() == currentMonth) ?
                currentEmployee.earnings() + 100.0 : currentEmployee.earnings());
        }

        // get type name of each object in employee array
        for(int j=0; j<employees.length; j++){
            System.out.printf("Employee %d is a %s\n",
             j, employees[j].getClass().getName());
        }
    }
}