// Fig. 8.6: Time2SecondsTest.java
// Overloaded constructors used to initialize Time2 objects.
public class Time2SecondsTest
{
	public static void main(String[] args)
	{
		Time2Seconds t1 = new Time2Seconds(); // 00:00:00 
		Time2Seconds t2 = new Time2Seconds(2); // 02:00:00 
		Time2Seconds t3 = new Time2Seconds(21, 34); // 21:34:00
		Time2Seconds t4 = new Time2Seconds(11, 30, 50); // 12:25:42
		Time2Seconds t5 = new Time2Seconds(t4); // 12:25:42 
		System.out.println("Constructed with:");
		displayTime("t1: all default arguments", t1);
		displayTime("t2: hour specified; default minute and second", t2);
		displayTime("t3: hour and minute specified; default second", t3);
		displayTime("t4: hour, minute and second specified", t4);
		displayTime("t5: Time2Seconds object t4 specified", t5);
		// attempt to initialize t6 with invalid values
		try
		{
			Time2Seconds t6 = new Time2Seconds(27, 74, 99); // invalid values
		}
		catch (IllegalArgumentException e)
		{
			System.out.printf("%nException while initializing t6: %s%n",e.getMessage());
		}		
	}
	// displays a Time2Seconds object in 24-hour and 12-hour formats
	private static void displayTime(String header, Time2Seconds t)
	{
		System.out.printf("%s%n %s%n %s%n",header, t.toUniversalString(), t.toString());
	}
}  // end class Time2SecondsTest