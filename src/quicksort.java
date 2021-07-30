
public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[]= {12,18,15,21,19,30,4,17};
		  
		
//		int p=7;
//		int i;
//		for(i=0;i<8;i++)
//		{
//			if(arr[i]>arr[p] && p>i)
//			{
//				int temp=arr[i];
//				arr[i]=arr[p];
//				arr[p]=temp;
//				p=i;
//			}
//			if(p<i && arr[p]>arr[i]) {
//				int temp=arr[i];
//				arr[i]=arr[p];
//				arr[p]=temp;
//				p=i;
//			}
//			
//			for(int j=0;j<8;j++) {
//				System.out.print(arr[j]+" ");
//			}
//			System.out.println();
//		}
		  
//		
//		
//		
//		System.out.println(p+" "+i);
		
		  int arr[]= {99,41,98,42,97,43,40,96,50};
		  int h=8;
		  int p=8;
		  int maxpos=-1;
		  int i;
		  for(i = 0;i<9;i++)
		  {
			  if(arr[p]>arr[i])
			  {
				  maxpos++;
				  int temp=arr[i];
				  arr[i]=arr[maxpos];
				  arr[maxpos]=temp;
			  }
		  }
		  int temp=arr[p];
		  arr[p]=arr[maxpos+1];
		  arr[maxpos+1]=temp;
		  
		  
		 
		  for(int j=0;j<9;j++) {
				System.out.print(arr[j]+" ");
		}
		  
	}

}
