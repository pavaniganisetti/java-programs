public class CreatingMultipleObjects
{
	public static void main(String[] args) {
		//Multiple objects of one type can be created as in the case of primitives
		//ex: int a = 100,b = 200;
		Pen pen1 = new Pen(), pen2 = new Pen(); //Creating two Pen objects
		pen1.penColor = "Black";
		pen2.penColor = "Blue";
		System.out.println("Pens Available: "+pen1.penColor+","+pen2.penColor);

	}
}
class Pen
{
	String penColor;
}