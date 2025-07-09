package TodayInterview;

public class p15EvenNo 
{
	public static void main(String[] args) 
	{
		int a=12;
	
		if(a % 2 == 0)
		{
			System.out.println("Even No: ");
		}
		else
		{
			System.out.println("Odd No: ");
		}
	
		int x=10;
		int y=20;
		int z;
		
		z=x;
		x=y;
		y=z;
		
		System.out.println("X value:- "+x);
		System.out.println("Y Value:- "+y);
		
		System.out.println("Without usng The third variable:- ");
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("X value:- "+x);
		System.out.println("Y Value:- "+y);
		
		
	}
}
