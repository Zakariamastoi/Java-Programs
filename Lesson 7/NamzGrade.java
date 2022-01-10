// Fig. 7.18: NamzGrade.java
//  class using a two-dimensional array to store grades. 
public class NamzGrade{
	private String name; // name of Man this grade book represents
	private int[][] grades; // two-dimensional array of student grades
	// two-argument constructor initializes courseName and grades array
	public NamzGrade(String name, int[][]grades){
	this.name = name; 
	this.grades = grades;
	}
	// method to set the course name
	public void setName(String name){
	this.name = name;	
	}
	// method to retrieve the course name
	public String getName()
	{
		return name;
	} 
	// perform various operations on the data
	public void processGrades()
	{
		// output grades array
		outputGrades();
	}
	// determine average grade for particular set of grades
	public double getAverage(int[] setOfGrades) 
	{ 
	 int total = 0; 
	 
	 // sum grades for one student 
	 for (int grade : setOfGrades) 
	 total += grade; 
	 
	 // return average of grades 
	 return (double) total / setOfGrades.length; 
	}
 // output the contents of the grades array
	public void outputGrades()
	{
		System.out.printf("The grades are:%n%n");
		System.out.print(" "); // align column heads
		// create a column heading for each of the tests
		//for (int test = 0; test < grades[0].length; test++) 
		//System.out.printf("Test %d ", test + 1);
		System.out.print("		Fajar" + "	Zuhr" + "	Asr" + "	Maghrib" + "	Isha" );
		System.out.println("	Average"); // student average column heading
		// create rows/columns of text representing array grades
		for (int student = 0; student < grades.length; student++) 
		{
			System.out.printf("Student %2d", student + 1);
			 for (int test : grades[student]) // output student's grades
			System.out.printf("%8d", test); 
			// call method getAverage to calculate student's average grade;
			// pass row of grades as the argument to getAverage
			double average = getAverage(grades[student]);
			System.out.printf("%9.2f%n", average);
		}
	}
}