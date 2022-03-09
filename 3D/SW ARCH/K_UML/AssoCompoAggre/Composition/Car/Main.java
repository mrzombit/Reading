import java.io.*;

class GFG {
	public static void main(String[] args)
	{
		Engine engine = new Engine();
		Car car = new Car(engine);
		car.move();
	}
}
