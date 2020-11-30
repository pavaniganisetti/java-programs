class Water
{
	String largestOcean = "Pacific";
	void displayOcean(){
		System.out.println("Oceans are large water bodies.");
	}
}
public class SingleInheritance extends Water
{
	public static void main(String[] args) {
		SingleInheritance obj = new SingleInheritance();
		obj.displayOcean();
		System.out.println("Largest Ocean on earth: "+obj.largestOcean);
	}
}
