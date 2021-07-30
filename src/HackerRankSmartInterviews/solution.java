package HackerRankSmartInterviews;
import java.io.*;
import java.util.*;

//public class solution {
//    public static void PrintRo(int arr[][], int n)
//    {
//    	int res[][] = new int[n][n];
//        for(int i=n-1,col=0;i>=0 && col<=n-1;i--,col++)
//        {
//            for(int j=0,row=0;j<=n-1 && row<=n-1;j++,row++)
//            {
//                res[row][col]=arr[i][j];
//            }
//        }
//        for(int i=0;i<n;i++)
//        {
//        	for(int j=0;j<n;j++)
//        	{
//        		System.out.print(res[i][j]);
//        	}
//        	System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        int t,n;
//        Scanner sc = new Scanner(System.in);
//         t = sc.nextInt();
//        int res=0;
//        for(int k=0;k<t;k++)
//        {
//            n=sc.nextInt();
//            int arr[][] = new int[n][n];
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                arr[i][j]=sc.nextInt();
//                
//            }
//            
//        }
//            PrintRo(arr,n);
//        }
//    }
//}
import java.io.*;
import java.util.*;

public class solution {
    public static long util(long n, long[] f)
    {
          
        if(n==0 || n==1) return 1;
        
        if(f[(int) n]!=0) return f[(int) n];
        
         f[(int)n] = util(n-1,f)%1000000007+util(n-2,f)%1000000007;
         return f[(int) n];
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        Scanner sc = new Scanner(System.in);
         t = sc.nextInt();
         
        for(int k=0;k<t;k++)
        {
            long n = sc.nextLong();
            long f[] = new long[(int) (n+2)];
            long res=util(n,f);
          
            System.out.println(res);
        }
        
    }
}