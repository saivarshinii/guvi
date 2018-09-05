import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set61
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
			String a;
    int px;
     Scanner s=new Scanner(System.in);
     px=s.nextInt();
     a=String.valueOf(px);
     char b[]=a.toCharArray();
     for(int i=0;i<b.length;i++){
System.out.printf("%c\t",b[i]);
}	}
}
