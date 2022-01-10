import java.util.Scanner
public class MinimumFinder{
	public static void main (String args []){
	Scanner input = new scanner(System.in);
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		double result = minimum(double number1 , double number2 , double number3);
		System.out.print("Minimum Number is :"+ result);
	}
}