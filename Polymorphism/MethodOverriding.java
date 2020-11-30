//If subclass (child class) has the same method as declared in the parent class, 
//it is known as method overriding in Java.
//Method overriding is used for runtime polymorphism.
class Vehicle
{
	void run(){
		System.out.println("Vehicle is running.");
	}
}
class Car extends Vehicle{
	void run(){  	//overriding the parent class method.
		System.out.println("Car is running.");
	}
}

public class MethodOverriding
{
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
	}
}