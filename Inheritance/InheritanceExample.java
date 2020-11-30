class ParentClass
{
	String parentClassField="parentClass/superClass/baseClass";
	String display(){
		return "This is parentClass/superClass/baseClass";
	}
	
}
public class InheritanceExample extends ParentClass
{
	String subClassField="subClass/derivedClass/childClass";
	public static void main(String[] args) {
		InheritanceExample obj1 = new InheritanceExample();
		System.out.println("Parent class field: "+obj1.parentClassField);
		System.out.println("Parent class method: "+obj1.display());
		System.out.println("Child class field: "+obj1.subClassField);
	}
}