/* Date
 RW @ 2014-09-06
 */
 
 public class Date
{
	private int month;
	private int day;
	private int year;
	
	//no argument constructor
	public Date()
	{
	
	}
	
	public Date(int mo, int dy, int yr)
	{
		setMonth(mo);
		setDay(dy);
		setYear(yr);
		
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
	public static void setMonth(int m)
	{
		month = m;
	}
	
	public static void setDay(int d)
	{
		day = d;
	}
	
	public static void setYear(int y)
	{
		year = y;
	}
	
	//toString Method
	public String toString()
	{
		return (month + "-" + day + "-" + year);
	}
}//End Class