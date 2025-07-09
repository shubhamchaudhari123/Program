package TodayInterview;

public class p02SumArray 
{
	public static void main(String[] args) 
	{
		int a[]= {23,45,23,78,65,3,2,33};
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}

		
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Addition Of no: "+sum);
	}
}
