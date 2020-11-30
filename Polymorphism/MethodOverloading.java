public class MethodOverloading
{
	//if a class has multiple methods having same name but different
	//in parameters. It is method overloading
	//--increases readability of the program.
	public static void main(String[] args) {
		Addition addition = new Addition();
		System.out.println(Addition.add(10,10));
		System.out.println(addition.add(10,10,10));
		System.out.println(addition.add(10,10.5));
	}
}
class Addition
{
	static int add(int a,int b){ //we can still make all methods to be static. Then there is no need to create Addition object.
		return a+b;
	}
	int add(int a,int b,int c){ //changing no.of arguments
		return a+b+c;
	}
	double add(int a,double b){ //changing data type of arguments
		return a+b;
	}
}