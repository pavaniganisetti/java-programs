public class AnanymousObjects
{
	//An object which has no reference is known as an anonymous object
	//Only used at the time of creation.
	public static void main(String[] args) {
		double side = 1.25;
		double squareArea = new Square().computeArea(side);
		System.out.println("Area of square with side: "+side+" is "+squareArea);
	}
}
class Square
{
	double computeArea(double side)
	{
		return side*side;
	}
}