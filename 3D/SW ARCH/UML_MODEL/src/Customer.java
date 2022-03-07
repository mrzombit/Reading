
public class Customer {

	private String custId;
	private String name;
	
	public Customer(String custId,String name)
	{
		this.custId = custId;
		this.name =name;
		
	}
	public void display()
	{
		System.out.println("Customer ID: "+custId+"\n"+"Customer Name:"+name);
	}
}
