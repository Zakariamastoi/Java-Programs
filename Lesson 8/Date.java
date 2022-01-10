// Fig. 8.7: Date.java 
// Date class declaration.
public class Date
{
	private int month; // 1-12
	private int day; // 1-31 based on month
	private int year; // any year
	private static final int[] daysPerMonth = 
		{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	// constructor: confirm proper value for month and day given the year
	public Date(int month, int day, int year)
	{
		// check if month in range
		if (month <= 0 || month > 12)
		throw new IllegalArgumentException("month (" + month + ") must be 1-12");
		// check if day in range for month
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
		throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		// check for leap year if month is 2 and day is 29
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
		throw new IllegalArgumentException("day (" + day +") out-of-range for the specified month and year");
		this.month = month;
		this.day = day;
		this.year = year;
		System.out.printf("Date object constructor for date %s%n", this);
	}
	// return a String of the form month/day/year
	public String toString()
	{
		return String.format("%d/%d/%d", month, day, year);
	}
}  // end class Date








// public class Date
// {
	// private String month; // 1-12
	// private int day; // 1-31 based on month
	// private int year; // any year
	// private int dayOfYear;
    // private static final int MONTHS_IN_YEAR = 12;
    // private static final int FEB_LEAP_YEAR = 29;

   // non static so as not to screw up non leap year february's
    // private final int[] daysPerMonth =
    // {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // private static final String[] startMonths =
    // {"", "January", "February", "March", "April", "May", "June", "July", "August",
     // "September", "October", "November", "December"};

    // private static final String[] startDays =
    // {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    // private int[] date = new int[3];

    // constructors
    // overloaded constructors need to set year first
    // to check for/against leap year
    // default
    // public Date()
	// {
        // date[0] = 1;
        // date[1] = 1;
        // date[2] = 1900;
    // }
	
   // mm dd yyyy - 3 ints
    // public Date(String month, int day, int year){
        // this.year = year;
        // this.month = month;;
        // this.day = day;;
    // }
	
    //month dd yyyy - string month 2 ints
    // public Date(String month, int day, int year){
        // this.year = year;
		// this.month = month;
        // this.day = day;;
    // }
	
   // DDDD YYYY - longform day number and year
    // public Date(int dayOfYear, int year){
        // this.year = year;
        // this.dayOfYear = dayOfYear;
    // }
	
   /// SETTERS
    // public void setMonth(String month)
	// {
        // date[0] = checkMonth(month);
    // }
	
	   // get month and day from day of year
    // public void setLongFormDay(int dayOfYear)
	// {
        // if(dayOfYear <= 0 || dayOfYear > 365)
            // throw new IllegalArgumentException("day of year must be 1-365");

        // int month = 1;

        //if leap year fix daysPerMonth day count
        // if(isLeapYear() && daysPerMonth[2] != FEB_LEAP_YEAR)
            // daysPerMonth[2] = FEB_LEAP_YEAR;

        determine the month by sequentially subtracting daysPerMonth
        and incrementing months counter. Remainder is day of month
        // while(dayOfYear > daysPerMonth[month]){
            // dayOfYear -= daysPerMonth[month];
            // month++;
        // }

        // this.month = month;;
        // this.day = dayOfYear;
    // }
	 // public int getMonth()
	// {
        // return date[0];
    // }
	
    // public void setStringMonth(String month)
	// {
        // date[0] = checkStringMonth(month);
    // }
    // public void setDay(int day)
	// {
        // date[1] = checkDay(day);
	// }
	

    // public void setYear(int year)
	// {
        // date[2] = checkYear(year);
    // }
   
    // public int getDay()
	// {
        // return date[1];
    // }
    // public int getYear()
	// {
        // return date[2];
    // }
    
    // private int getDayOfYear()
	// {
        // int tmp = 0;

        // for(int i=1; i<date[0]; i++)
		// {
            // tmp += daysPerMonth[i];
        // }
        // return tmp + date[1];
    // }

    // private int checkStringMonth(String month)
	// {
        // if(month.length() > 1)
            // month = month.substring(0, 1).toUpperCase() + month.substring(1);

//check for matches
        // for(int i=1; i<startMonths.length; i++)
		// {
            // if(startMonths[i].equals(month))
                // return i;
        // }

        // throw new IllegalArgumentException("invalid month string");
    // }

    // private int checkMonth(int testMonth)
	// {
        // if(testMonth > 0 && testMonth <= MONTHS_IN_YEAR)
            // return testMonth;
        // else
            // throw new IllegalArgumentException("month must be 1-12");
    // }

    // private int checkDay(int testDay)
	// {
        // if(isLeapYear() && daysPerMonth[2] != FEB_LEAP_YEAR)
            // daysPerMonth[2] = FEB_LEAP_YEAR;

        // if(testDay > 0 && testDay <= daysPerMonth[getMonth()])
            // return testDay;

        // throw new IllegalArgumentException("day out of range for specified month and year");
    // }

    // private boolean isLeapYear()
	// {
        // return (getYear() % 400 == 0 || (getYear() % 4 == 0 && getYear() % 100 != 0));
    // }
   // check year is within 4 digit range and not negative
    // private int checkYear(int testYear)
	// {
        // if(testYear >= 0 && testYear <= 9999)
            // return testYear;
        // else
            // throw new IllegalArgumentException("year must be 0-9999");
    // }

    // public String toString()
	// {
        // return String.format("%02d/%02d/%04d", date[0], date[1], date[2]);
    // }
    // public String toLongDateString()
	// {
        // return String.format("%s %02d %04d", startMonths[date[0]], date[1], date[2]);
    // }
    // public String toDayOfYearString()
	// {
        // return String.format("%03d %04d", getDayOfYear(), date[2]);
    // }
// }
