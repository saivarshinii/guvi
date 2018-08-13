import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stringset3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int len=str.length();
		int cnt=0;
		for(int i=0;i<len;i++)
		{
			if(Character.isLetter(str.charAt(i)) && (str.charAt(i)!='.'))
			{
				System.out.println("No");
				break;
			}
			else 
			     cnt++;
		}
		if(len==cnt)
		   System.out.println("Yes");
	}
}
