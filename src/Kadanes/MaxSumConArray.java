package Kadanes;

public class MaxSumConArray {
	
	public static void main(String args[])
	{
   int arr[]= {1,2,3,4};
		   //{-2, -3, 4, -1, -2, 1, 5, -3};
   int n =arr.length;
   int max_so_far = -100;
   int max_sum_upto_i = 0;
   for(int i=0;i<n;i++)
   {
	   max_sum_upto_i = max_sum_upto_i +arr[i];
	   
	   if(max_sum_upto_i>max_so_far)
	   {
		   max_so_far = max_sum_upto_i;
	   }
	   if(max_sum_upto_i<0)
	   {
		   max_sum_upto_i = 0;
	   }
   }
   System.out.println(max_so_far);
}
}
