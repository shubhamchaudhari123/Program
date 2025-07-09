package TodayInterview;

public class p09PrimeNo
{
	public static void main(String[] args) 
	{
		int a=13;
		int count=0;
		
		for(int i=2; i<a; i++)
		{
			if(a % i == 0)
			{
				count++;
			}
		}
		
		if(count > 1)
		{
			System.out.println("Not Prime No...");
		}
		else
		{
			System.out.println("Prime No...");
		}
	}
}
