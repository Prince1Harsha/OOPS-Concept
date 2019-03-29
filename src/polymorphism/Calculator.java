package polymorphism;

public class Calculator {

	public int add(int a,int b)
	{
		return a+b;
	}
	
	public double add(double a,int b)
	{
		return a+b;
	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		System.out.println("Sum of 2 integers:"+c.add(10, 20));
		System.out.println("Sum of double and integer:"+c.add(10.89, 20));
		System.out.println("Sum of 3 integers:"+c.add(10, 20,20));
	}

}
