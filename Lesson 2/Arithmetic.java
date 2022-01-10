// Excercice 2.15 (Arithmetic):
import java.util.Scanner; 
public class Arithmetic
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	int number1;
	int number2;
	int sum;
	int product;
	int difrent;
	int division;
	System.out.println("Enter the first integher");
	number1 = input.nextInt();
	System.out.println("Enter the second integher");
	number2 = input.nextInt();
	sum = (number1 + number2);
	product = (number1 * number2);
	difrent = (number1 - number2);
	division = (number1 / number2);
	System.out.println("sum is :" +sum);
	System.out.println("product is :"+product);
	System.out.println("difrent is :" + difrent);
	System.out.println("division is :" + division);
	}
}