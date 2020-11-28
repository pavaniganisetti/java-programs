public class CopyConstructor
{
	//No copy constructor in java like in C++.
	//But we can copy the values of one object into another.
	//Method:
	//-by constructor
	//-by assigning values from one object to another
	//-by clone() method of Object class

	public static void main(String[] args) {
		Pamplet party1 = new Pamplet(100,"Pink");
		Pamplet party2 = new Pamplet(party1); //copy using constructor.
		Pamplet party3 = new Pamplet();
		party3.pampletCount = party2.pampletCount; //copying values withour constructor.
		party3.pampletColor = party2.pampletColor;
		party1.display();
		party2.display();
		party3.display();
	}
}
class Pamplet
{
	int pampletCount;
	String pampletColor;
	Pamplet() {}
	Pamplet(int count,String color)
	{
		pampletCount = count;
		pampletColor = color;
	}
	Pamplet(Pamplet pamplet)
	{
		pampletCount = pamplet.pampletCount;
		pampletColor = pamplet.pampletColor;
	}
	void display()
	{
		System.out.println("Count: "+ pampletCount+", Color: "+pampletColor);
	}
}