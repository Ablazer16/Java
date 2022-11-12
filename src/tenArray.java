import java.util.*;

public class tenArray
{
	public static void main(String args[])
	{
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 10; i++)
		{
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			arr[i] = num;
		}

		System.out.println("Enter the number to search: ");
		int num = sc.nextInt();

		for(int i = 0; i < 10; i++){
			if(num == arr[i])
				System.out.println("Element you entered "+arr[i]+" is at position"+ i);
		}


	}

}