import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set52
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s1,s2;
		Scanner s=new Scanner(System.in);
		s1=s.nextLine();
		s2=s.nextLine();
		if(s1.compareTo(s2)>0)
		{
		    System.out.print(s1);
		}
		else
		{
			System.out.print(s2);
		}
	}
}
