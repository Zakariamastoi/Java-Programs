
public class Student
{
	private String name;
	private double average;
	//private double grade;

public Student(String name,double average){
		this.name = name;
		if(average > 0.0 && average < 100.0)
				this.average = average;
			//this.grade = grade;
	}
public void setName(String name){
	this.name = name;
}
public String getName(){
	return name;
}	
public void setAverage(double average){
	if(average > 0.0 && average < 100.0)
				this.average = average;
}	
public double getAverage(){
	return average;
}
// public void setGrade(String grade){
	// this.grade = grade;
// }
public String getGrade(){
     String grade = "";
	if(average >= 90)
			grade = ("A");
				else if (average >= 80)
						grade = ("B");	
					else if(average >= 70)
							grade = ("C");
						else if(average >= 60)
								grade = ("D");
							else
								grade = ("Failed");
	return grade;
}
}