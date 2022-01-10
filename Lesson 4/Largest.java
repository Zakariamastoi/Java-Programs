// Qustion 4.22
import java.util.Scanner;
public class Largest{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		int large=0;
		System.out.print("Enter the ten Numbers :");
		for(int count = 1; count <= 10;count++){
					 count = input.nextInt();
			if(count >= 10){
				large = count;
			}
			System.out.printf("%s Largest Number is :", large);
		}
	}
}
