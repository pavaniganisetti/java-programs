//Super is a reference variable which is used to refer immediate parent class object.
/*
Whenever you create the instance of subclass, an instance of parent 
class is created implicitly which is referred by super reference variable.

Usage of Java super Keyword
    super can be used to refer immediate parent class instance variable
    super can be used to invoke immediate parent class method.
    super() can be used to invoke immediate parent class constructor
*/
class Language{
	String countryName = "India";
	int noOfLanguages = 22;
	Language(){
		System.out.println("Parent class constructor.");
	}
	void Greet(){
		System.out.println("Hello!");
	}
}
class Hindi extends Language{
	String languageName = "Hindi";
	Hindi(){ //super() will be first statement through we don't provide. so constructor will be called.
		System.out.println("Hindi class constructor.");
	}
}
class Telugu extends Language{
	String languageName = "Telugu";
	Telugu(){
		super(); //invokes parent class constructor.
		System.out.println("Telugu class constructor.");
	}
	void Greet(){
		System.out.println("Namaskaram!");
	}
	void showInfo(){
		System.out.println("Official languages in India: "+super.noOfLanguages); //referring parent class instance variable
		System.out.println("AP people speak: "+languageName); //referring to current class variable.
		super.Greet(); //Invoking parent class method.
		Greet();//Invoking current class method.
	}
}

public class SuperKeyword
{
	public static void main(String[] args) {
		Telugu obj1 = new Telugu();
		Hindi obj2 = new Hindi();
		obj1.showInfo();
	}
}