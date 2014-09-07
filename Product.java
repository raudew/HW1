/* Product
 RW @ 2014-09-06
*/

public class Product
{
	private String title;
	private Double price;
	private Date purchaseDate;
	
	public Product(String _title, Double price; Date _date)
	{
	
	}//End Product Constructor

	//get methods
	public static String getTitle()
	{
		return title;
	}
	
	public static Double getPrice()
	{
		return price;
	}
	
	public static Date getPurchaseDate()
	{
		return purchaseDate;
	}
	
	public static void setTitle(String _title)
	{
		title = _title;
	}
	
	public static void setPrice(Double _price)
	{
		price = _price;
	}
	
	public static void setPurchaseDate(Date _date)
	{
		date = _date;
	}
	
	public String toString()
	{
		return ("Title: " + title + "\n\rPrice: " + price + "\n\rPurchaseDate: " + date);
	}
	
}//End Product Class