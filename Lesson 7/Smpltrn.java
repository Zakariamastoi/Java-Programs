import java.util.Scanner;
public class Smpltrn{
	private int accumulater;
	private int [] memory;
	private int instruction;
	private int instructionCounter;
	private int operationCode;
	private int operands;
	// public Smpltrn ( ) 
	// {
		// displayWelcomeMessage ();
		//initialiseVariables ();
	// }
	// public void displayWelcomeMessage ( ) 
	// {
		// System.out.printf ("\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s %s\n%s %s\n", 
			// "*** Welcome to Simpletron! ***",
			// "*** Please enter your program one instruction ***",
			// "*** (or data word) at a time into the input   ***",
			// "*** text field. I will display the location   ***",
			// "*** number and a question mark (?). You then  ***",
			// "*** type the word for that location. Press the***",
			// "*** Done button to stop entering your program ***",
			// " Loc", " Inst", "****", "*****");
	// }
public static void main(String [] args){
	memory = new int [100]; 
	instructionCounter = 0;
	Scanner input = new Scanner (System.in);
	instruction = memory[instruction];
	//operationCode = memory [ instructionCounter ] / 100;
	operationCode = instruction / 100;
	//operands = memory [ instructionCounter ] % 100;
	operands = instruction % 100;
	instructionCounter++;
	}
switch (operatinCode){ 
	
			case 10: // Read a word from the keyboard into a specific location in memory
				Scanner input = new Scanner ( System.in );
				System.out.print ( "Please Enter a whole number (positive or negative): " );
				memory [ operands ] = input.nextInt ();	// place the result in the specified memory location
				break;
			case 11:	// write a specific location in memory to the screen
				System.out.println ("The result of the operation is " + memory [ operands] );
				break;
			case 20: // load a word from a specific location into the accumulator 
				accumulator = memory [ operands ];
				break;
			case 21: 	// Store a word from the accumulator into a specific location in memory
				memory [ operands ] = accumulator;
				break;
			case 30: // add a word from a specific location in memory to the word 
				// in the accumulator ( leave the result in the accumulator 
				accumulator += memory [ operands ];
				break;
			case 31: // Subtract a word from a specific location in memory from the 
				// word in the accumulator ( leave the result in the accumulator )
				accumulator -= memory [ operands ];
				break;
			case 32:	// Divide a word from a specific location in memory into the 
			       // word in the accumulator ( leave the result in the accumulator )
				accumulator /=  memory [ operands ];
				break;
			case 33: // Multiply a word from a specific location in memory by the
			       // word in the  accumulator ( leave the result in the accumulator )
				accumulator *= memory [ operands ];
				break;
			case 40:	// branch to a specific location in memory
				instructionCounter = operands;
				break;
			case 41:	// branch to a specific location in memory if the accumulator is negative 
				if ( accumulator < 0 )
					instructionCounter = operands;
				break;
			case 42:	// branch to a specific location if the accumulator is zero
				if ( accumulator == 0 )
					instructionCounter = operands;
				break;
			case 43: 	// Halt. The program has completed its tasks
				dumpTheCore ();	// do a "core dump"
				System.out.printf ("\n%s\n", "The program has ended...");
				System.exit ( 0 );
				break;
		//} 
		// instructionCounter++;
		public void dumpTheCore ( )
	{
		System.out.printf ("\n%30s\n%30s\t%s%4d\n%30s\t%2d\n%30s\t%2d\n%30s\t%2d\n%30s\t%2d\n\n%30s\n", "REGISTERS:", 
				"accumulator", "+", accumulator, "instruction counter", instructionCounter, "instruction ",
			       	instruction, "operation code", operationCode, "operand", operand, "MEMORY:" );
		for ( int i = 0; i < 10; i++ )
		{
			System.out.printf ( "%6d", i);
		}

		System.out.println ();
		int counter = 0;	// counter to ensure that we go through the whole loop

		// display the memory cells themselves in both vertical and horizontal order
		for (int i = 0; i < 10; i++ ) 
		{
			if ( counter %10 == 0 )
				System.out.printf ("%2d ", counter);
			for (int j = 0; j < 10; j++) 
			{	
				// Lets apply some formatting to improve the display
				if ( memory [ counter ] == 0 )
					System.out.printf ( "%s%s", "+", "0000 ");
				else 
					System.out.printf ("%s%4d ", "+", memory [counter]);
				counter++;

			}	// end inner for
		       
		System.out.println ();	
		
		}	// end outer for
	}
}