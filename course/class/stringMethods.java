public class stringMethods
{
	public static void main(String args[])
	{
		String name = "Amity University";
		replac re = new replac();
		re.replac(name);

		String example = "Hello World";
		contain co = new contain();
		co.contain(example);

		chararr carr = new chararr();
		carr.chararr(example);
	}
}

class replac
{
	public void replac(String name)
	{
		String name1 = name.replace('y','i');
		System.out.println(name1+"\n");
	}
}

class contain
{
	public void contain(String example)
	{
		System.out.println(example.contains("Sup"));
		System.out.println(example.contains("are you"));
		System.out.println(example.contains("bi"));
		System.out.println();
	}
}


class chararr
{
	public void chararr(String example)
	{
		char[] ch = example.toCharArray();

		for(int i = 0; i < ch.length; i++)
			System.out.print(ch[i]);
	}
}