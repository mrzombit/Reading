final class Car {

	private final Engine engine;

	Car(Engine engine)
	{
		this.engine = engine;
	}

	public void move()
	{
		if(engine != null)
		{
			engine.work();
			System.out.println("Car is moving ");
		}
	}
}