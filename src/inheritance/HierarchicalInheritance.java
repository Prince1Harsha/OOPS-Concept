package inheritance;

public class HierarchicalInheritance 
{

	public static void main(String[] args) 
	{
		Dog d = new Dog();
		
		d.eat();  // Calling Parent Method from (Animal.java)
		
		d.barks(); //Calling Child Method from (Puppy.java)
		
		Cat c = new Cat();
		c.eat();	// Calling Parent Method from (Animal.java)
		c.hisses();	//Calling Child Method (Cat.java)
		
	}

}
