import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Twelve
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  int r,sum=0,temp; 
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  temp=n;    
          while(n>0){    
                       r=n%10;  
                       sum=(sum*10)+r;    
                      n=n/10;        
                 	}
	               if(temp==sum)
	               {
                     System.out.println("Yes ");    
                     }else 
                     {
                     System.out.println("No");
                     }
}
}
