
public class Shop {
	protected String location;
	protected String address;
	public Shop(String location,String address)
	{
		this.location =location;
		this.address = address;
	}
	public void display()
	{
		System.out.println("Locattio ="+location + "\n"+ "Address = "+ address);
		
	}

}
