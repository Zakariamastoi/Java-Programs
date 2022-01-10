// Fig. 7.19: NamzGradeTest.java
// GradeBookTest creates GradeBook object using a two-dimensional array 
// of grades, then invokes method processGrades to analyze them.
public class NamzGradeTest{
	// main method begins program execution
	public static void main(String[] args){
		// two-dimensional array of student grades
		int[][] gradesArray = {{2,4,0,4,4}, 
		{2,0,0,3,4}, 
		{2,4,4,3,4}, 
		{2,4,4,0,4}, 
		{2,4,4,0,0}, 
		{2,4,4,3,0}, 
		{0,4,4,0,0}, 
		{2,4,0,0,0}, 
		{2,4,0,0,4}, 
		{2,4,4,3,3}};
		NamzGrade myNamzGrade = new NamzGrade(
			"Students", gradesArray );
		System.out.printf("Welcome to the grade Namz of%n%s%n%n", 
			myNamzGrade.getName());
		myNamzGrade.processGrades();
	} 
} //end class GradeBook1Test