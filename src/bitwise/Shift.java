package bitwise;

public class Shift {
	public static void main(String args[]) {
		System.out.println(5 << 1); // N<<i == N*pow(2,i)
		System.out.println(5 >> 1);// N<<i == N/pow(2,i)

		// set bit at position
		int n = 4;
		int f = 1;
		int i = 2;
		f = f << i;
		int res = n & f;
		if (res == 0)
			System.out.print("false");
		else
			System.out.print("true");
		// counting number of set bits
		int n1 = 2;
		int count = 0;
		while (n1 != 0) {
			int res1 = n1 & 1;
			if (res1 == 1)
				count++;
			n1 = n1 >> 1;
		}
		System.out.println(count);

		// power of 2
		int n2 = 8;
		int c1 = 0;
		while (n2 != 0) {
			int res2 = n2 & 1;
			if (res2 == 1)
				c1++;
			n2=n2>>1;
		}
		if(c1==1)System.out.println("power of two");
		
		System.out.println(8^8^8^8);
	}

}
