/*
 The java compiler copies the instance initializer block in the 
 constructor after the first statement super(). So firstly, constructor is invoked. 

 Note: The java compiler copies the code of instance initializer block in every constructor.

 There are mainly three rules for the instance initializer block. They are as follows:

  -  The instance initializer block is created when instance of the class is created.
  -  The instance initializer block is invoked after the parent class constructor 
    is invoked (i.e. after super() constructor call).
  -  The instance initializer block comes in the order in which they appear.

*/
class Vehicle{
	Vehicle(){
		System.out.println("Parent class constructor");
	}
}
public class InstanceInitializerBlock extends Vehicle
{
	int speed;
	InstanceInitializerBlock(){
		System.out.println("Child class constructor ");
	}
	InstanceInitializerBlock(int s){
		System.out.println("Child class constructor "+s);
	}
	{ //Initializer block
		speed = 100;
		System.out.println("Speed of vehicle "+speed); 
	}

	public static void main(String[] args) {
		InstanceInitializerBlock obj1 = new InstanceInitializerBlock();
		InstanceInitializerBlock obj2 = new InstanceInitializerBlock(10);
	}
}