// Fig. 3.9: Account3Test.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;
public class Account3Test{
	public static void main(String[] args) {
		Account3 account1 = new Account3("Jane Green", 50.00);
		Account3 account2 = new Account3("John Blue", -7.53); 
		// display initial balance of each object
		System.out.printf("%s balance: $ %n",
		account1.getName()); 
		System.out.printf("%s balance: $ %n%n",
		account2.getName()); 
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nadding to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount); // add to account1’s balance
		// display balances
		System.out.printf("%s balance:  $ %n",account1.getName(),account1.getBalance()); 
		//System.out.print(account1.getName(),account1.getBalance()); 
		System.out.printf("%s balance:  $ %n",account2.getName(),account2.getBalance()); 
		//System.out.print(account2.getName(),account2.getBalance()); 
		System.out.print("Enter deposit amount for account2: "); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nadding to account2 balance%n%n",depositAmount);
		account2.deposit(depositAmount); // add to account2 balance
		// display balances
		System.out.printf("%s balance:$ %n",account1.getName(),account1.getBalance());
		//System.out.print(account1.getName(),accunt1.getBalance());
		System.out.printf("%s balance:$ %n",account2.getName(),account2.getBalance());
		//System.out.print(account2.getName(),account2.getBalance());
	}
}