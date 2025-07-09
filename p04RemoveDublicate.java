package TodayInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class p04RemoveDublicate 
{
	public static void main(String[] args) 
	{
		int a[]= {23,34,78,3,24,90,3,21,34};
		
		TreeSet dublicate=new TreeSet<>();
		
		for(int i=0; i<a.length; i++)
		{
			dublicate.add(a[i]);
		}
		
		System.out.println(dublicate);
		
		
		
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println("This is Dublicate Array: "+a[i]);
					break;
				}
			}
			
		}
		
		
		
	
		
		
	}
}
