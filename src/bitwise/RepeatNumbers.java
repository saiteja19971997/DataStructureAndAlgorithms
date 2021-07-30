package bitwise;

public class RepeatNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,3,3,2,2,2,4,4,4,10,7,7,7};                            
		
//		0011
//		0011
//		0011
//		0010
//		0010
//		0010
//		0100
//		0111
//		0111
//		0111
		int num=0;
		for(int i=0;i<32;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				int res=0;
				res = arr[j] & (1<<i);   //     0010
				if(res!=0)count++;
			}
			//System.out.println(count);
			if(count%3!=0) {
			num=(int) (num+Math.pow(2,i));
			}
			
		}
		
		System.out.println(num);

	}

}
