public class StaticKeyword
{
	//used mainly for memory management.
	//can apply static keyword to variable(class variable),method (class method),block,nested class.
	//gets memory only once in the class area at the time of class loading.
	//java static property  is shared to all objects.

	static { //static block
		System.out.println("Hello there! This is excecuted before main.");
	}
	public static void main(String[] args) {

		 State state1 = new State("Andhra Pradesh"); 
		 state1.display();

		 State.abbrevate("Ind"); //static variables can be changed only in static method.
		 						//static method cannot access non-static data members and call non-static method.

		 State state2 = new State("Telangana");
		 state2.display();
	}
}
class State
{
	static String countryName = "India";
	String stateName;

	State(){}
	State(String name)
	{
		stateName = name;
	}
	void display()
	{
		System.out.println("State: "+stateName+", Country: "+countryName);
	}
	static void abbrevate(String name) //this and super keyword  cannot be used in static context.
	{
		countryName = name;
	}
}