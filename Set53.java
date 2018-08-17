import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set53
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==' ')
			    continue;
			else
			   System.out.print(st.charAt(i));
		}
	}
}
