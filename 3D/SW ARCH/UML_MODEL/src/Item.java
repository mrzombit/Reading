
public class Item {

	
	private int itemId;
	private String name;
	private double price;
	
	public Item(int itemId,String name, double price)
	{
		
		this.itemId =itemId;
		this.name =name;
		this.price =price;
		
	}
	public void display()
	{
	
		System.out.println("Item ID:"+itemId+"\n"+"Item Name:"+name+"\n"+"Price: "+price);
	}
}
