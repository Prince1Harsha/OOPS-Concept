package abstraction;

abstract class Bike {
	public abstract void run();
	public double speed;
	public void changeGear()
	{
		System.out.println("Gear Changed");
	}
}

