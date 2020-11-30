//When two are more extends same class that is called Hieratchical Inheritance.

class Animals
{
	void animalSounds(){
		System.out.println("Animal sounds vary from animal to animal.");
	}
}
class Cat extends Animals{
	void catSound(){
		System.out.println("Meow Meow");
	}
}
class Dog extends Animals{
	void dogSound()
	{
		System.out.println("Dogs Bark");
	}
}
class HierarchicalInheritance extends Dog{ 
	public static void main(String[] args) {
		HierarchicalInheritance obj = new HierarchicalInheritance();
		obj.animalSounds();
		obj.dogSound();
		// obj.catSound(); results compilation error as current class doesn't extend cat in any way. 	
	}
}