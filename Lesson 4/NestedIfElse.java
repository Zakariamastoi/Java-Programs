// Question 4.7
public class NestedIfElse{
	public static void main (String[]args){
		int grade = 70;
		if(grade >= 90)
			System.out.println("A");
				else
					if (grade >= 80)
						System.out.println("B");	
					else
						if(grade >= 70)
							System.out.println("C");
						else
							if(grade >= 60)
								System.out.println("D");
							else
								System.out.println("Failed");	
							
						
	}
}