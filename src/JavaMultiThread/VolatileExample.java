package JavaMultiThread;

import java.util.Scanner;

// voltalie keyword is used to alternate for thread synchronisation 
class processor extends Thread
{
	boolean running = true;
	public void run() {
		while(running)
		{
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void shut()
	{
		running = false;
	}
}
public class VolatileExample {

	public static void main(String[] args) {
       
      processor p1 = new processor();
      p1.start();
      
      System.out.println("press return to stop");
      Scanner sc = new Scanner(System.in);
      sc.nextLine();
      p1.shut();
      
      // if there is no volatile key mentioned to running p1 never stops
	}

}
