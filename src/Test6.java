public class Test6
{
	public Test6()
	{
		System.out.println("1");
		new Test6(10);
		System.out.println("5");
	}
	public Test6(int temp)
	{
		System.out.println("2");
		new Test6(10,20);
		System.out.println("4");
	}
	public Test6(int data, int temp)
	{
		System.out.println("3");
	}

	public static void main(String args[])
	{
		Test6 obj = new Test6();
	}
}