import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Arms
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp;
		temp=n;
		int r,sum=0;
		while(n>0)
		  {
		  	r = n % 10;
		  	n = n /10;
		  	sum = sum + r*r*r;
		  }
		  if(temp==sum)
		  {
		     System.out.println("yes");
		  }
		   else{
		   	System.out.println("no");
		   }
	}
		
	}
