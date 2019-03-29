package polymorphism;

public class BankTest {

	public static void main(String[] args) 
	{
		AxisBank a = new AxisBank();
		System.out.println("AxisBank Interest is:"+a.getRateOfInterest());
		
		HDFC h = new HDFC();
		System.out.println("HDFC Bank rate of Interest is:"+h.getRateOfInterest());
	}

}
