package DynamicPrograms;

import java.util.Arrays;

public class CoinMaxWaysToSum {
    public static int util(int c[], int sum, int n)
    {
    	if(sum == 0) return 1;
    	if(n<=0) return 0;
    	if(c[n-1]<=sum)
    	{
    		return (util(c,sum - c[n-1],n)+ util(c,sum,n-1));
    	}
    	else
    	{
    		return util(c,sum,n-1);
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int c[]= {3,4,5,2};
	      int sum = 5;
	     
	      int res=util(c,sum,c.length);
	      System.out.println(res);
	}

}
