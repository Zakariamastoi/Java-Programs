 // Fig. 5.6: Interest.java
import java.lang.Double;
public class Zakat
{ 

	public static void main(String[] args)
	{
		double zakat;
		double amount = 1000000;
		double rate = 0.025;
		for (int year = 1; year <= 10; ++year) 
		{ 
			zakat = amount*rate;// Math.pow(1.0 - rate, year);
			System.out.printf("%d%s%f%s%f%n",year,"	", amount,"		",zakat);
			amount = amount - zakat;
	 
		}
	} 
} 