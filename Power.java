import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Power {
 
    // Function to check if 
    // x is power of 4
    static int isPowerOfTwo(int n)
    {
        if(n == 0)
        return 0;
        while(n != 1)
        { 
            if(n % 2 != 0)
            return 0;
            n = n / 2;     
        }
        return 1;
    } 
 
    // Driver program 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int test_no=sc.nextInt();
        if(isPowerOfTwo(test_no) == 1)
         System.out.println("yes");
        else
         System.out.println("no");
	}
}
