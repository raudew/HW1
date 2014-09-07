/* Date
 RW @ 2014-09-06
 */
 
 public class Date
{
	private int month;
	private int day;
	private int year;
	
	public Date(int _month, int _day, int _year)
	{
		setMonth(_month);
		setDay(_day);
		setYear(_year);
		
	}//End Date Constructor
	
	//get Methods
	public static int getMonth()
	{
		return month;
	}
	public static int getDay()
	{
		return day;
	}
	public static int getYear()
	{
		return year;
	}

	//set Methods
	public static void setMonth(int _month)
	{
		month = _month;
	}
	
	public static void setDay(int _day)
	{
		day = _day;
	}
	
	public static void setYear(int _year)
	{
		year = _year;
	}
	
	//toString Method
	public String toString()
	{
		return (month + "-" + day + "-" + year);
	}
}//End Class