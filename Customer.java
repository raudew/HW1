/* Customer
 */
import java.util.ArrayList;
public class Customer
{
	private String name;
	private Address address;
	private int accountNumber;
	ArrayList<product> productList= new ArrayList<Product>();
	
	public Customer(String _name, Address _address, int _accountNumber)
	{
		setName(_name);
		setAddress(_address);
		setAccountNumber(_accountNumber);
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
	Double charge = calculateCharge();

		int numberOfMusicProducts = 0;
		int numberOfApps = 0;

		for(int i = 0; i < productList.size(); i++)
		{
			if ((productList.get(i).title == "Meet Bach")
					|| (productList.get(i).title == "Rihanna")
					|| (productList.get(i).title == "For the Road"))
				numberOfMusicProducts++;
			else
				numberOfApps++;
		}

		return (name + " " + numberOfMusicProducts + " " + "music products " + numberOfApps + " " + "apps" + " $" + charge + "\n");
	}

	
	//+calculateCharge(Void):Double
	public Double calculateCharge()
	{
	Double output = 0.00;

		for (int i = 0; i < productList.size(); i++) 
		{
			if ((productList.get(i).title == "Meet Bach")
					|| (productList.get(i).title == "Rihanna")
					|| (productList.get(i).title == "For the Road"))
				output = output + ((productList.get(i).price) * ((Music)productList.get(i)).numberOfSongsPurchased);
			else
				output = output + ((productList.get(i).price));
		}
		return output;
	}

	
	//+addToProductList(Product):Void
	public void addToProductList(Product _product)
	{
		productList.add(_product);
	}

}//End Class Customer