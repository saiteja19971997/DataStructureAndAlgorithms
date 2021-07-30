package DynamicPrograms;

public class PowerGameDp {

	public static void main(String[] args) {
		// TODO
		int A[] = {2,3};
		int B[] = {10,5};
		int n = A.length;
		int m = B.length;
		int t[][] = new int[n + 1][m + 1];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < m + 1; j++) {
				
			}
		}
		
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<m+1;j++)
			{
				if(A[i-1]>B[j-1])
				{
				   t[i][j] = 1+ Math.max(t[i-1][j-1],t[i][j-1]);	
				}
				else
				{
					t[i][j] = Math.max(t[i][j-1], t[i-1][j-1]);
				}
			}
		}
		for(int k=0;k<n+1;k++)
		{
			for(int l=0;l<m+1;l++)
			{
				System.out.print(t[k][l]+" ");
			}
			System.out.println();
		}
		
		System.out.println(t[n][m]);

	}

}
