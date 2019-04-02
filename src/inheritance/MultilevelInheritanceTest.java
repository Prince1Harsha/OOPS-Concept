package inheritance;

public class MultilevelInheritanceTest 
{

	public static void main(String[] args) 
	{

		Puppy p = new Puppy(); // Creating Object of Child class (Puppy.java)
		
		p.eat(); // Calling Grand Parent Method (Animal.java)
		
		p.barks(); // Calling Parent Method (Dog.java)
		
		p.weep();	// Calling Child Method (Puppy.java)
	}

}
