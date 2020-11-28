public class SwitchStatements
{
	public static void main(String args[]) {
		int month = Integer.parseInt(args[0])%2;
		switch(month)
		{
			case 0: System.out.println("It is a even month");
			break;
			case 1: System.out.println("It is a odd month");
			break;
			default: System.out.println("Invalid entry");
		}
	}
}