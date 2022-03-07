
public class Main {

	public static void main(String[]args)
	{
		Agora agora= new Agora ("Dhanmondi","Sukrabad","Agora Wow","017****");
		Item itm = new Item(101,"Buble",120.25);
		Outlet ol  = new Outlet(agora,itm);
		Customer c = new Customer("122","Rahim");
		Buy buy= new Buy("12/12/2020",1,itm,c);
		buy.display();
		
		ol.display();
		
		
		
	}
}
