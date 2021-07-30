package HackerRankSmartInterviews;

import java.util.Scanner;

public class Diamond {
	
	public static void PrintDiamond(int N){
        int ol=N-1;
        int flag=0;
        int l=0;
        int r=0;
        l=r=ol/2;
       
        for(int i=0;i<=ol;i++)
        {
            
            for(int j=0;j<=ol;j++)
            {
                if(j==l || j==r){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(l==0)flag=1;
            
            if(flag==1){
            	l++;
            	r--;
            }
            else
            {
            	l--;
            	r++;
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int N;
        for(int i=0;i<t;i++)
        {
            N = sc.nextInt();
            PrintDiamond(N);
        }
    }

}
