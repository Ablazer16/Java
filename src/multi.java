public class multi
{
	public static void main(String args[])
	{
		Thread t1 = new Thread(new Runnable(){
			public void run()
			{
				prime obj = new prime();
				obj.prime();
			}
		});
		t1.start();

		Thread t2 = new Thread(new Runnable(){
			public void run()
			{
				add obj1 = new add();
				obj1.add();
			}
		});
		t2.start();
	}
}

class prime
{
	public void prime()
	{
		int count = 0;
		for(int i = 2; i<100; i++)
		{
			int chk = 0;
			for(int j = 2; j<i; j++){
				if(i%j == 0){
					chk++;
					break;
				}
			}
			// System.out.println(chk);
			if(chk == 0){
				System.out.println(i);
				count++;
			}
		}
	}
}

class add
{
	public void add()
	{
		int a = 10, b = 5;
		int c = a+b;
		System.out.println("Addition is: "+ c);
	}
}