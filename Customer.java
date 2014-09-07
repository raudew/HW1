/* Customer
 RW @ 2014-09-06
 */
 
public class Customer
{
	private String name;
	private Address address;
	private int accountNumber;
	private ArrayList<product> productList;
	
	public Customer(String _name, Address _address, int _accountNumber)
	{
	
	}//End Method Customer
	
	//get Methods
	public static String getName()
	{
		return name;
	}
	
	public static Address getAddress()
	{
		return address;
	}
	
	public static int getAccountNumber()
	{
		return accountNumber;
	}
	
	//Set Methods
	public static void setName(String _name)
	{
		name = _name;
	}
	
	public static void setAddress(Address _address)
	{
		address = _address;
	}
	
	public static void setAccountNumber(int _accountNumber)
	{
		accountNumber = _accountNumber;
	}
	
	public String toString()
	{
		return ( name +"\n\r" + address + "\n\r" + "account#" + accountNumber);
	}	
	
	//+createHistory():String
	public String createHistory()
	{
	
	}
	
	//+calculateCharge(Void):Double
	public Double void calculateCharge()
	{
	
	}
	
	//+addToProductList(Product):Void
	public void addToProductList(Product _product)
	{
	
	}

}//End Class Customer