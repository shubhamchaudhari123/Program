package TodayInterview;

public class p23Space1 
{
	public static void main(String[] args)
	{
		
		for(int i=5; i>=1; i++)
		{
			for(int j=5; j<=i; j++)
			{
				System.out.println(" ");
			}
			System.out.println();
			
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
