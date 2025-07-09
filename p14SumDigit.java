package TodayInterview;

public class p14SumDigit
{
	public static void main(String[] args) 
	{
		int a=896842;
		int sum=0;
		
		while(a != 0)
		{
			int digit=a%10;
			sum=sum+digit;
			a=a/10;
		}
		System.out.println("Addtion of No: "+sum);
	
	}
}


