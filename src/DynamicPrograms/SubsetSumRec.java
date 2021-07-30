package DynamicPrograms;

public class SubsetSumRec {
	 public static int fun(int arr[], int n, int tar, int t[][])
	{
		//System.out.println(n+" "+tar);
		if(tar == 0) 
			{
			return 1;
			}
		if(n<=0) return 0;
		
		if(t[n][tar]==1 || t[n][tar]== 0)
		{
			System.out.println("IN");
			return t[n][tar];
		}
		
		if(arr[n-1] <= tar)
		{
			t[n][tar]=fun(arr,n-1,tar-arr[n-1],t)+fun(arr,n-1,tar,t);
			return (t[n][tar]);
			
//			t[n][tar] = t[n-1][tar-arr[n-1]] || t[n-1][tar];
		}
		else
		{
			t[n][tar]=fun(arr,n-1,tar,t);
			return (t[n][tar]);
//			t[n][tar] = t[n-1][tar]
		}
		// end result stored in t[n][w]
	}

	public static void main(String[] args) {
		
		
		int arr[] = {1,5,6,11};
		int n = 4;
		int tar = 6;
		int t[][] = new int[n+1][tar+1];
		for(int k=0;k<n+1;k++)
		{
			for(int l=0;l<tar+1;l++)
			{
				t[k][l] = -1;
			}
		}
		int res = fun(arr, n, tar,t);
		
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<tar+1;j++)
			{
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(res);
		

	}

}
