package DynamicPrograms;

import java.util.Scanner;

public class PowerGame {
    public static int util(int A[],int B[],int n, int m, int t[][])
    {
    	if(n==0 || m==0) return 0;
    	if(t[n][m]!=0)
    	{
    		System.out.println("n");
    		return t[n][m];
    	}
    	if(A[n-1]>B[m-1])
    	{
    		t[n][m]=1+Math.max(util(A,B,n-1,m-1,t), util(A,B,n,m-1,t));
    		return t[n][m];
    	}
    	else
    	{
    		t[n][m] = Math.max(util(A,B,n,m-1,t),util(A,B,n-1,m-1,t));
    		return t[n][m];
    	}
    
    }
	public static void main(String[] args) {
		int A[] = {3,7,10};
		int B[] = {5,20,15};
		int n = A.length;
		int m = B.length;
		int t[][] = new int[n+1][m+1];
		int res = util(A,B,n,m,t);
		System.out.println(res);
		System.out.println(t[n][m]);
	}
}
