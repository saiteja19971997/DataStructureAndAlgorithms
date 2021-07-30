package DynamicPrograms;

import java.util.Arrays;

public class PrintAllSubsets {
	public static void func(int arr[],int res[], int i, int n)
	{
		if(i==n)
		{
			for(int k=0;k<n;k++)
			{
				//if(res[k]!=-1) {
				System.out.print(res[k]+" ");}
			//}
			System.out.println();
			return;
		}
		res[i]=arr[i];
		i++;
		func(arr,res,i,n);
		i=i-1;
		res[i]=-1;
		i++;
		func(arr,res,i,n);
		
		return;
	}
	public static void main(String args[])
	{
		int arr[] = {5,15,3};
		
		int n=3;
		int res[] = new int[n];
		int i=0;
		Arrays.sort(arr);
		func(arr,res,i,n);
		
		
		
	}

}
