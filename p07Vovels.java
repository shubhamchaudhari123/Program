package TodayInterview;

public class p07Vovels 
{
	public static void main(String[] args)
	{
		
		String name="Shubham Chaduahri";
		
		int rev=name.replaceAll("[^AEIOUaeiou]", "").length();
		String space=name.replaceAll(" ", "");
		System.out.println("Without Space:- "+space);
		
		System.out.println("Vovels count:- "+rev);
		
		
		
		
		int vovelscount=0;
		int consonets=0;
		for(int i=0; i<name.length(); i++)
		{
			char ch=name.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vovelscount++;
			}
			else
			{
				consonets++;
			}
		}
		
		System.out.println("Vovelse useing Regular Method:- "+vovelscount);
		System.out.println("Consonets Count:- "+consonets);
	}
}

