package abstraction;

public class Honda extends Bike{
	
	public void run()
	{
		System.out.println("Honda is Best Brand");
	}

	public static void main(String[] args) 
	{
		Bike b = new Honda();
		b.speed=45.5;
		System.out.println("Speed of Honda Bike is:"+b.speed);
		b.run();
		b.changeGear();
	}

}
