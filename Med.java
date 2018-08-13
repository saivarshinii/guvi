import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Med
{
   public static int findMean(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) 
            sum += a[i];
     
        return (int)sum / (int)n;
    }
 
    // Function for calculating median
    public static int findMedian(int a[], int n)
    {
        // First we sort the array
        Arrays.sort(a);
 
        // check for even case
        if (n % 2 != 0)
        return (int)a[n / 2];
     
        return (int)(a[(n - 1) / 2] + a[n / 2]) / 2;
    }
 
    // Driver program
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
         n = a.length;
        System.out.println(findMedian(a, n)); 
	}
}
