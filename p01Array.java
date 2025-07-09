package TodayInterview;

import java.util.Arrays;
import java.util.Collections;

public class p01Array 
{
	public static void main(String[] args)
	{
		Integer a[]= {43,67,98,32,46,4,12,90,41};
		
		System.out.println("Array:- "+Arrays.toString(a));
		
		int max=Collections.max(Arrays.asList(a));
		int min=Collections.min(Arrays.asList(a));
		
		System.out.println("Maximum Array:- "+max);
		System.out.println("Minimum Array:- "+min);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Without Short Cut....");
		
		int b[]= {24,34,89,23,55,8};
		int max1=b[0];
		
		System.out.println("Second Array:- "+Arrays.toString(b));
		
		for(int i=1; i<b.length; i++)
		{
			if(b[i] > max1)
			{
				max1=b[i];
			}
		}
		
		System.out.println("Maximum Array: "+ max1);
		
		System.out.println("--------------------------------------------");
		
		int c[]= {23,3,2,49,7,654,32,3,4,32};
		int min1=a[0];
		
		System.out.println("Third Array Pring:- "+Arrays.toString(c));
		
		for(int i=1; i<a.length; i++)
		{
			if(c[i] < min1)
			{
				min1=c[i];
			}
		}
		
		System.out.println("Minimum array:- "+min1);
		
		System.out.println("*********************Reverse Array C ************************");
		
		for(int i=c.length-1; i>=0; i--)
		{
			System.out.println(c[i]+ " ");
		}
		
		
	}
}
