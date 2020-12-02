/*
The final keyword in java is used to restrict the user. 
The java final keyword can be used in many context. Final can be:
    -variable Stop value change
    -method   Stop method overriding
    -Class    Stop Inheritance
*/

final class Universe{}
//class Planet extends Universe{} //compile time error as final class cannot be extended.
class Ocean{
	final String largestOcean = "Pacific Ocean"; //final variable

	final void largestOcean(){
		System.out.println(largestOcean);
	}
/*		
	marks = 85; compile time error as It can't be changed because 
				final variable once assigned a value can never be changed. 
*/
}
public class FinalKeyword extends Ocean
{
	void show(){
		super.largestOcean(); //inherited but cannot be overriden
	}
/*	
	cannot override it as it is declared as final.
	void largestOcean(){
		System.out.println(super.largestOcean);
	}
*/	
	public static void main(String[] args) {
		FinalKeyword obj = new FinalKeyword();
		obj.show();
	}
}