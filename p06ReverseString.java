package TodayInterview;

public class p06ReverseString 
{
	public static void main(String[] args) 
	{
		
		String name="Shubham";
		String rev=" ";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);
		}
		
		System.out.println("Regular Method Reverse Strin:- "+rev);
		
		
		String reverse=new StringBuffer(name).reverse().toString();
		System.out.println("Reverse String:- "+reverse);
		
		
	}
}
