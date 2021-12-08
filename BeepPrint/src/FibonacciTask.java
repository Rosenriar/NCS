
public class FibonacciTask implements Runnable {
	public void run() {
		int a = 0;
		int b = 0;
		for (int c = 1; c < 1000; c++) {
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
