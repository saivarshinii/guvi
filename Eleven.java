import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Eleven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int exponent=sc.nextInt();
		long result=1;
		while(exponent!=0)
		{
			result *=base;
			--exponent;
		}
		System.out.println(result);
			}
}
