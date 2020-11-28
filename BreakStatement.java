public class BreakStatement
{
	public static void main(String[] args) {
		//Break statement is used to break loop or switch statement
		for (int i=0;i<3;i++)
		{
			switch(i)
			{
				case 0: System.out.println("Switch:"+i);
				break;
				case 1: System.out.println("Switch:"+i);
				break;
				default: System.out.println("Switch default:"+i);
				break;
			}
			if (i == 2)
			{
				break;
			}
			System.out.println("Number i:"+i);
		}
		System.out.println("After for loop:");

	}
}