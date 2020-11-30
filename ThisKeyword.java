public class ThisKeyword
{
	//'This' is a reference variable, refers to current object.
	public static void main(String[] args) {
		Zoo zoo1 = new Zoo("Jurasic Park",1000);
		zoo1.feedAnimals();

		Zoo zoo2 = new Zoo();
		zoo2.printReferenceId();//this and below statements returns same reference id.
		System.out.println(zoo2);
	}
}
class Zoo
{
	String zooName;
	int animalsCount;
	Zoo(){
		System.out.println("Default Constuctor!");
	}
	Zoo(String zooName){
		this();	//this(): to invoke current class constructor.
		this.zooName = zooName; //this: to refer to current class instance variable.
	}
	Zoo(String zooName,int animalsCount){ //call to this must be first statement.
		this(zooName); //reusing constructor from the constructor i.e. constructor chaining.
		this.animalsCount = animalsCount;
	}

	void feedAnimals(){
		System.out.println("Feeding animals.");
		this.allowVisitors(); //this: to invoke current class method.
	}
	void allowVisitors(){
		System.out.println("Allowed visitors.");
	}
	void printReferenceId()
	{
		System.out.println(this);
	}
}