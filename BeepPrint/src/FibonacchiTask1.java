
public class FibonacchiTask1 extends Thread {
	@Override
	public void run() {
		int a = 1;
		int b = 1;
		int c = 1;

		do {
			System.out.println(a + "+" + b + "=" + c);
			a = b;
			b = c;
			c = a + b;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		} while (c < 1000);
	}
}
//for (c = 1; c < 1000;) {
//System.out.println(a+"+"+b+"="+c);
//a = b;
//b = c;
//c = a + b;
