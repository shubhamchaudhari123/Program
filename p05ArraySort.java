package TodayInterview;

import java.util.Arrays;

public class p05ArraySort 
{
	public static void main(String[] args) 
	{
		int a[]= {23,533,2,35,32,234,90};
		int temp;
		
		System.out.println("regular Array:- "+Arrays.toString(a));
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] >a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Shorted Array:-  "+Arrays.toString(a));
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+ " ");
		}
		
		
	}
}
