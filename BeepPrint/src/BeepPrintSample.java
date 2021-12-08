
public class BeepPrintSample {

	public static void main(String[] args) {
		Thread bt1 = new BeepTesk1();
		bt1.start();
		
		Thread Fi1 = new FibonacchiTask1();
		Fi1.start();
//		Runnable bt = new BeepTask();
//		Thread thread = new Thread(bt);
//		thread.start();   // run()호출

//		Runnable Fi = new FibonacciTask();
//		Thread thread_Fi = new Thread(Fi);
//		thread_Fi.start(); // run()호출

		for (int i = 0; i < 5; i++) {
			System.out.println("AAAA");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
