package TodayInterview;

public class p11FibonaciSeries 

{
	public static void main(String[] args)
	{
		int a=0; 
		int b=1;
		int c;
		
		for(int i=1; i<10; i++)
		{
			c=a+b;
			System.out.println("Fibinacci series..."+c);
			a=b;
			b=c;
			
		}
	}
}
