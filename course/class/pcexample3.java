class pcexample3
{
	private int var;
	public pcexample3(int num)
	{
		var=num;
	}

	public int getValue()
	{
		return var;
	}

	public static void main(String args[])
	{
	pcexample3 myobj=new pcexample3(4); System.out.println("Value of var is:" +myobj.getValue());
	}
}