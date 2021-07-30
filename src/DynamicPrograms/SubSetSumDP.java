package DynamicPrograms;

public class SubSetSumDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,3};
		int n = 4;
		int tar = 4;
		int t[][] = new int[n+1][tar+1];
		for(int i=0;i<n+1;i++)
		{
			for(int j=0; j<tar+1;j++)
			{
				if(i==0)
				{
					t[i][j] = 0;
				}
				if(j==0) {
					t[i][j] = 1;
				}
			}
		}
		
		
		
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<tar+1;j++)
			{
				if(arr[i-1]<=j)
				{
					t[i][j] = Math.max(t[i-1][j-arr[i-1]] , t[i-1][j]);
				}
				else
				{
					t[i][j] = t[i-1][j];
				}
			}
		}
		
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<tar+1;j++)
			{
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("res"+t[n][tar]);
		

	}

}
