
public class Agora extends Shop {

	private String outlet;
	private String cell;
	
	public Agora(String location,String address,String outlet, String cell)
	{
		
		super(location,address);
		this.outlet = outlet;
		this.cell=cell;
	}
	public void display()
	{
		super.display();
		System.out.println("Outlet ="+outlet+"\n"+"Cell:"+cell);
	}
}
