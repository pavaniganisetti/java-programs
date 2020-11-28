public class IfConditions
{
	public static void main(String[] args) {
		int a = 100;
		int b = 100;
		int c = 100;
		System.out.println("a value:"+a+"\nvalue of b:"+b+"\nvalue of c:"+c);
		if (a == 100 && b == 100 && c == 100)
		{
			if ( a/10 == 10)
			{
				System.out.println("Inside If,If ie.,scaling factor 2 ");
			}
			else
			{
				System.out.println("Inside If,else ie., scaling factor 1");
			}
		}
		else
		{
			System.out.println("Inside else ie., scaling factor 1");
		}
	}
}