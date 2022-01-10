public class DateAndTIme
{
	public static void main (String[] args)
	{
		Date d1 = new Date(12, 3, 2021);
		Time2 t1 = new Time2(); // 00:00:00 
		Time2 t2 = new Time2(2); // 02:00:00 
		Time2 t3 = new Time2(21, 34); // 21:34:00
		Time2 t4 = new Time2(12, 25, 42); // 12:25:42
		Time2 t5 = new Time2(t4); // 12:25:42 
		System.out.println("Constructed with:");
		displayTime("t1: all default arguments", t1);
		displayTime("t2: hour specified; default minute and second", t2);
		displayTime("t3: hour and minute specified; default second", t3);
		displayTime("t4: hour, minute and second specified", t4);
		displayTime("t5: Time2 object t4 specified", t5);
		System.out.println(d1);
	}	
	private static void displayTime(String header, Time2 t)
	{	
		System.out.printf("%s%n %s%n %s%n",header, t.toUniversalString(), t.toString());
	}
}