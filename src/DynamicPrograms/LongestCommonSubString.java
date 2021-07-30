package DynamicPrograms;

public class LongestCommonSubString {
    public static int util(String A, String B, int n , int m, int count)
    {
    	if(n == 0 || m == 0) return count;
    	//if(A.charAt(n-1) != B.charAt(m-1)) return 0;
        if(A.charAt(n-1) == B.charAt(m-1))
        {
           count = util(A,B,n-1,m-1,count+1);
            
        }
       
             count = Math.max(count,Math.max(util(A,B,n,m-1,0), util(A,B,n-1,m,0)));
   
		return count;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A ="abcdefi";
		String B ="abc";
		int c =0;  
		int n = A.length();
		int m = B.length();
		 int res=util(A,B,n,m,c);
	        System.out.println(res);

	}

}
