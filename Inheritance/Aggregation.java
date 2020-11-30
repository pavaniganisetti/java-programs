public class Aggregation
{
	//if a class has a entity reference it is known as aggregation.
	//represents has-a relationship.
	public static void main(String[] args) {
		Address address = new Address(500200,"Telangana","Warangal","Warangal");
		Employee employee = new Employee(121,"Agasthya",address);
		employee.display();
	}
}
class Employee
{
	int employeeId;
	String employeeName;
	Address address; //Address class in Employee class
	Employee(int employeeId,String employeeName,Address address){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
	}
	void display()
	{
		System.out.println("EmployeeId: "+employeeId+"\nEmployeeName: "+employeeName);
		System.out.println("Address:"+address.pincode+","+address.state+","+address.district+","+address.city);
	}
}
class Address
{
	int pincode;
	String state;
	String district;
	String city;
	Address(int pincode,String state,String district,String city){
		this.pincode = pincode;
		this.state = state;
		this.district = district;
		this.city = city;
	}
}
