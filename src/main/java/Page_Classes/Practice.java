package Page_Classes;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Practice {
	
	int count[] = new int[256];
	
	public void occurance(String name)
	{
		char ch[]=name.toCharArray();
		for(int i= 0;i<name.length();i++)
		{
			count[name.charAt(i)]++;
		}
		LinkedHashSet<Character> li = new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++)
		{
			li.add(ch[i]);
			
		}
		for(Character c:li)
		{
			System.out.println(c + " = " +count[c]);
		}
	}
	public void fibonaic()
	{
		int prenum=0, nextnum=1;
		for(int i=0;i<10;i++)
		{
			System.out.print(prenum  +" ");
			int sum= prenum+nextnum;
			prenum = nextnum;
			nextnum = sum;
			
		}
	}
	public void palindrome(String name)
	{
		String prenum = name, out="";
		char ch[] =name.toCharArray();
		for(int i = ch.length-1;i>=0;i--)
		{
			out =out+ch[i];
		}
		if(out.equalsIgnoreCase(prenum))
		{
			System.out.println(name = "is palindrome");
		}
		else
		{
			System.out.println(name = "is not palindrome");
		}
		
	}
	public void aramstrong(int num)
	{
		int digit =0,prenum =num,lastdigit,postnum=0;
		while(num>0)
		{
			num =num/10;
			digit++;
		}
		num = prenum;
		while(num>0)
		{
		lastdigit = num%10;
		num =num/10;
		int sum =1;
		for(int i=1;i<=digit;i++)
		{
			sum =  sum*lastdigit;
		}
		postnum = postnum +sum;
		}
		if(prenum ==postnum)
		{
			System.out.println(prenum + " is aramstrong");
		}
		else
		{
			System.out.println(prenum + " is not aramstrong");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr sentance");
		int num = sc.nextInt();
		//String name = sc.nextLine();
		Practice ob = new Practice();
		//ob.occurance(name);
		//ob.fibonaic();
		//ob.palindrome(name);
		ob.aramstrong(num);
		
	}

}
