import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set51
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int ptr=0;
		String n="";
		for(int i=0;i<str.length();i++)
		{
		    if(str.charAt(i)==' ')
		      { ptr=i;
		       for(int j=i+1;j<str.length();j++)
		       {n+=str.charAt(j);}
		      }
		}
		int x=Integer.parseInt(n);
		for(int i=0;i<x;i++)
		{
		    for(int j=0;j<ptr;j++)
		    {
		        System.out.print(str.charAt(j));
		    }
		    System.out.println();
		}
	}
}
