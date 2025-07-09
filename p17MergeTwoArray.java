package TodayInterview;

import java.util.ArrayList;
import java.util.Collections;

public class p17MergeTwoArray 
{
	public static void main(String[] args)
	{
		Integer a[]= {34,23,86,2,3,4,2};
		Integer b[]= {23,289,93,43};
		
		ArrayList mearge=new ArrayList<>();
		
		Collections.addAll(mearge, a);
		Collections.addAll(mearge, b);
		
		System.out.println("Mearge Two Arrays:- "+mearge);
		
		
		
	}
}
