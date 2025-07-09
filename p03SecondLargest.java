package TodayInterview;

import java.util.Arrays;

public class p03SecondLargest 
{
	public static void main(String[] args) 
	{
		
		int a[]= {23,5,332,68,54,21,90};
		
		Arrays.sort(a);
		
		System.out.println("Sorted Array:- "+Arrays.toString(a));
		
		int max=a[a.length-1];
		int secmax=a[a.length-2];
		int SecMin=a[1];
		
		
		System.out.println("Maximum Array:- "+max);
		System.out.println("Second Max Array:- "+secmax);
		System.out.println("Second Minimum Array:- "+SecMin);
		
		
	}
}



