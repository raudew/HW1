/* Address
 RW @ 2014-09-06
 */
 
 public class Address
{
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public Address()
	{
		setStreet("");
		setCity("");
		setState("");
		setZip(0);
	}
	public Address (String _street, String _city, String _state, int _zip)
	{
		setStreet(_street);
		setCity(_city);
		setState(_state);
		setZip(_zip);
		
	}//End Address Constructor
	
	//get Methods
	public static String getStreet()
	{
		return street;
	}
	
	public static String getCity()
	{
		return city;
	}
	
	public static String getState()
	{
		return state;
	}
	
	public static int getZip()
	{
		return zip;
	}
	
	//set Methods
	public static void setStreet(String _street)
	{
		street = _street;
	}
	
	public static void setCity(String _city)
	{
		city = _city;
	}
	
	public static void setState(String _state)
	{
		state = _state;
	}
	
	pubic static void setZip(int _zip)
	{
		zip = _zip;
	}
	
	pubic static String toString()
	{
		return ( street + ", " + city + " " + state + " " + zip );
	}
}//End Class