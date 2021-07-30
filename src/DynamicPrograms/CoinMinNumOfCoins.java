package DynamicPrograms;

public class CoinMinNumOfCoins {
     public static int util(int c[], int sum, int n, int i)
     {
    	 if(sum == 0)
    	 {
    		 System.out.println(i);
    		return i;
    	 }
    	 if(n<=0)
    	 {
    		 return 1000;
    	 }
    	 
    	 if(c[n-1]<=sum)
    	 {    i=i+1;
    		 int x=util(c,sum-c[n-1],n,i);
    		 i=i-1;
    		 int y=util(c,sum,n-1,i);
    		 return Math.min(x, y);
    	 }
    	 else
    	 {
    		 return util(c,sum,n-1,i);
    	 }
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int c[]= {1};
      int sum = 5;
      int i=0;
      int res=util(c,sum,c.length,i);
      System.out.println(res);
	}

}
