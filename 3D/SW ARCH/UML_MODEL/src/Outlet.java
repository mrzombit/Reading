
public class Outlet {
	Agora agora;
	Item item;
	public Outlet(Agora agora,Item item)
	{
		this.agora =agora;
		this.item=item;
	}
	public void display()
	{
		agora.display();
		item.display();
	}
}
