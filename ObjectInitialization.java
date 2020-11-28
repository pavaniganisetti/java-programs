public class ObjectInitialization
{
	//Initialization means storing data into objects
	public static void main(String[] args) {
		//1.By reference variable
		//2.By method
		//3.By Constructor
		House house1 = new House();
		house1.houseName = "Ananda Nilayam"; //Initializing through a reference variable
		house1.noOfRooms = 5;	//Initializing through a reference variable
		System.out.println("House name: "+house1.houseName+"\nNo.of Rooms available are: "+house1.noOfRooms);

		House house2 = new House();
		house2.insertHouseDetails("Vaikuntam",5);	//Initializing through a method
		System.out.println("House name: "+house2.houseName+"\nNo.of Rooms available are: "+house2.noOfRooms);

	}
}
class House
{
	String houseName;
	int noOfRooms;
	void insertHouseDetails(String houseName,int noOfRooms)
	{
		this.houseName = houseName;
		this.noOfRooms = noOfRooms;
	}
}