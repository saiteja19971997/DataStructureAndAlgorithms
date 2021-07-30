package JavaMultiThread;
// using runnable interface

class App1Runner implements Runnable{
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("hi "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
public class App1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new App1Runner());
		Thread t2 = new Thread(new App1Runner());
		t1.start();
		t2.start();
		

	}

}
