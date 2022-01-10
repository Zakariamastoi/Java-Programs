import java.util.Scanner;
class BinaryFromDecimel{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Decimel Number :");
		int decimal = input.nextInt();
		int t = 2;
		int Remainder = 0;
		String A = " ";
		while(decimal>0){
			Remainder = decimal%t;
			decimal /= t;
			A = Remainder+A;
		}
		System.out.print(A);
	}
} 
