
public class Buy {

	private String date;
	private int qty;
	Item item;
	Customer customer;
	

	public Buy(String date,int qty,Item item,Customer customer)
	{
		this.date=date;
		this.qty=qty;
		this.item=item;
		this.customer =customer;
		
	}
	public void display()
	{
		System.out.println("Date:"+date+"\n"+"Quantity:"+qty);
		item.display();
		customer.display();
	}
	
}
