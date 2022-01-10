import java.util.Scanner;
public class Namaz{
	public static void main (String[]args){
		int count = 0;
		double average;
		int number = 0 ;
		Scanner input = new Scanner(System.in);
		 System.out.print("");
		while (input.hasNext()){
			int  namaz = input.nextInt();
			switch (namaz){
				case 2: 
				case 3: 
				case 5: 
				count+=4; 
				break; 
				case 1: 
				count+=2; 
				break; 
				case 4: 
				count+=3; 
				break;  
				default:
				System.out.println("please enter the number:");
				break;
			} 
			number++;
		}
			System.out.printf("%d%n",count);
			average = (double) count/number;
			System.out.print(average);
	}
}