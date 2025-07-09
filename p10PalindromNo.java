package TodayInterview;

public class p10PalindromNo
{
	public static void main(String[] args)
	{
		int a=121;
		int rev = 0;
		
		while(a != 0)
		{
			rev=rev*10 + a% 10;
			a=a/10;
		}
		System.out.println("Reverse No: "+rev);
		
		if(a == rev)
		{
			System.out.println("Not Palindrom No: ");
		}
		else
		{
			System.out.println("Palindrom No..");
		}
		
		
	}
}
