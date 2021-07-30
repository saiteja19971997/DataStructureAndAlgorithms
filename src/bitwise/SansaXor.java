package bitwise;

import java.util.Arrays;

public class SansaXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/// greater lesser number //combinations and permutations
		String num1 = "740948";
		char[] num = num1.toCharArray();
		int i;
		for (i = num.length-1; i >= 0; i--) {
			if(num[i]>num[i-1])
			{
				break;
			}

		}
		System.out.println(i);
		System.out.println(num);
		int minofmax=-1;
		int m=10;
		int k=0;
		for(k=i;k<=num.length-1;k++)
		{
			//System.out.println(num[k]+" "+num[i-1]+" "+m);
			if(m>Character.getNumericValue(num[k]) && num[k]>num[i-1])
			{
				//System.out.println("entered");
				minofmax=k;
				m=num[k];
			}
		}
		System.out.println(minofmax);
		char t;
		t=num[i-1];
		num[i-1]=num[minofmax];
		num[minofmax]=t;
		
		
		Arrays.sort(num, i, num.length);
		
		String res = new String(num);
		System.out.println(res);
		
		
		
		
	}

}
