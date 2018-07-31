import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fifteen
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a+1;i<=b-1;i++)
		   {
		   	if(i%2==0)
		   	    {
		   	    	System.out.println(i+" ");
		   	    }
           }
	}
}
