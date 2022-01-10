import java.util.Scanner;
import java.lang.Math;
public class Decimal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the binery number: ");
		int binery = input.nextInt();
		int currentNumber = 0;
		int decimal = 0;
		int count =0;
		while(binery >= 1){
			currentNumber = binery % 10;
			binery /= 10;
			decimal += currentNumber * Math.pow(2, count);
			count++;
		}//end of for loop
		System.out .print(decimal);
	}// end of main method
}// end of class Decimal