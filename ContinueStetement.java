public class ContinueStetement
{
	public static void main(String[] args) {
		int i = 0;
		//Continue statement is used to jump to the next iteration skipping the remaining code
		aa: //label
		while (i<2)
		{
			if (i == 1)
			{
				i++;
				continue aa;
			}
			System.out.println(i);
			i++;
		} 
	}
}