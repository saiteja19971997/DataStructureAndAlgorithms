
public class Flip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "011001001";
		int maxtillnow = 0;
		int count = 0;
		//int res[] = new int[2];
		int l = 0, r = 0;
		int temp = 0;

		for (int i = 0; i < A.length(); i++) {

			if (A.charAt(i) == '0')
				count++;
			if (A.charAt(i) == '1')
				count--;

			if (count > maxtillnow) {
				maxtillnow = count;
				l = temp;
				r = i;
			}
			if (count < 0) {
				count = 0;
				temp = i + 1;
				
			}

		}
		System.out.println(count);
		System.out.println(maxtillnow + " " + (l + 1) + " " + (r + 1));
		//return res;

	}

}
