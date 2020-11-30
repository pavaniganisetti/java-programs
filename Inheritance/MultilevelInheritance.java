class Plants
{
	void plantsInfo()
	{
		System.out.println("Plants provides oxygen");
	}
}
class Mango extends Plants
{
	String fruitColor = "Orange-Yellow";
	void displayColor(){
		System.out.println("Mangos are "+fruitColor +" in color.");
	}
}
public class MultilevelInheritance extends Mango 
//Chain of inheritance is known as multilevel inheritance
{
	public static void main(String[] args) {
		MultilevelInheritance obj = new MultilevelInheritance();
		obj.plantsInfo();
		obj.displayColor();
	}
}
