package JavaMultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleLocks {

	Random random = new Random();
	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();
	
	public void stageone() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(random.nextInt(100));
	}
	
	public void stagetwo() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list2.add(random.nextInt(100));
	}
	public void process() {
		for(int i=0; i<1000;i++)
		{
			stageone();
			stagetwo();
		}
	}
	public static void main(String[] args) {
		System.out.println("hello");

	}

}
