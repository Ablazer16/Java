public class divNum
{
	public static void main(String args[])
	{
		int num = 2, count = 0;

		while(true)
		{
			for(int i = 2; i < 11; i++)
			{
				if(num%i == 0)
					count++;
				
				else
					break;

			}

			if(count == 9)
			{
				System.out.println("The number div by 1-10: "+ num);
				break;
			}
			num++;
			count = 0;
		}

	}
}