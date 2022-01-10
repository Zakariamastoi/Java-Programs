// Fig. 20.9: StackTest.java
// Stack generic class test program.

public class StringStack 
{
	public static void main(String[] args) 
	{
		String [] StringFruits = {"Fruit", "Citrus", "Melon", "Kinu", "Malta", "Kharbuza", "Tarbooz"};
		
		// Create a Stack<Double> and a Stack<Integer>
		Stack<String> StringStack = new Stack<>();
		
		// push elements of doubleElements onto doubleStack
		testPushString(StringStack, StringFruits); 
		testPopString(StringStack); // pop from doubleStack
	}
		
	// test push method with double stack
	private static void testPushString(
	Stack<String> stack, String[] values)
	{
		System.out.printf("%nPushing elements onto doubleStack%n");
		
		// push elements to Stack
		for (String value : values)
		{
			System.out.printf("%s ", value);
			stack.push(value); // push onto doubleStack
		}
	}

	// test pop method with double stack
	private static void testPopString(Stack<String> stack)
	{
		// pop elements from stack
		try
		{
			System.out.printf("%nPopping elements from doubleStack%n");
			String popValue; // store element removed from stack
			
			// remove all elements from Stack
			while (true)
			{
				popValue =   stack.pop(); // pop from doubleStack
				System.out.printf("%s ", popValue); 
			} 
		}
		catch(EmptyStackException emptyStackException)
		{
			System.err.println();
			emptyStackException.printStackTrace();
		} 
	}
} // end class StackTest