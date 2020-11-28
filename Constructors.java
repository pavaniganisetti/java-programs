public class Constructors
{
	//is called when an instance of class created.
	//at the time of calling memory for object is allocated.
	//used to initialize object.
	//everytime an object is created with new keyword atleast one constructor is callled.
	//two types of constructors: no-args constructor, parameterized constructor.
	//java compiler creates a default constructor if your class don't have any.
	public static void main(String[] args) {
		Food foo1 = new Food();
		Food foo2 = new Food("Halwa");
		Food foo3 = new Food("Halwa","2 Bowls");
	}
}
class Food
{
	Food() //Default constructor is used to provide default values to the object.
	{
		System.out.println("Food is being prepared.");
	}
	Food(String foodname) //parameterized constructor.
	{
		System.out.println(foodname+" is being prepared.");
	}
	Food(String foodname, String quantity) //Constructor overloading is a technique of having
	//more than one constructor with different parameter list.
	{
		System.out.println(quantity+" of "+foodname+" is being prepared.");
	}
}