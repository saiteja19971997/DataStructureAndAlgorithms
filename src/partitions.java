
public class partitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,0,3};//{4, 0, 3, 1, 0, 2, 2};

		int s[] = new int[5];
		int p[] = new int[5];
		int sums = 0;
		int sump = 0;
		int ts = 9;
		for (int i = 0; i < 5; i++) {
			sums = sums + arr[i];
			if (sums == ts / 3) {
				s[i] = 1;
			}
		}

		for (int j = 4; j >= 0; j--) {
			sump = sump + arr[j];
			if (sump == 12 / 3) {
				p[j] = 1;
			}
		}
		int tc=0;
		for(int i=0;i<5;i++) {
			if(s[i]==1)
			{
				int btwsum=0;
				for(int j=i+1;j<5;j++) {
					btwsum=btwsum+arr[j];
					if(btwsum==ts/3) {
						tc++;
					}
				}
			}
		}
		System.out.println(tc);
	}

}
