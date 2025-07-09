package TodayInterview;

public class p18StringPalindrom 
{
	public static void main(String[] args)
	{
		String name="madam";
		
		String pali=new StringBuffer(name).reverse().toString();
		
		if (name.equals(pali))
		{
			System.out.println("String is Palindrom");
		}
		else
		{
			System.out.println("not Palindrom");
		}
		
		
	}
}
