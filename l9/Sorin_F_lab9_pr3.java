//lab 9 problema 3 Fratean Sorin, grupa 2022
//import java.util.Random;
//import java.util.Arrays;
import java.util.Scanner;

public class clasaTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the index: ");
		int desiredNumber = scanner.nextInt();
		scanner.close();

		if (desiredNumber < 0)
			System.out.println("Invalid input.");
		else {
			try {
				Thread fibonacciThread = new Thread(new Fibonacci(desiredNumber));
				Thread outputThread = new ExternClass();

				fibonacciThread.start();
				outputThread.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}


class Fibonacci implements Runnable {
	public static volatile double fn = 0; 
	public static volatile boolean isPrinted = false;
	boolean firstTime = true; 
	int index;

	public Fibonacci(int index) {
		this.index = index;
	}

	@Override
	public void run() {
		calculateDesiredNumber();
	}

	public synchronized void calculateDesiredNumber() {
		if (index == 1) {
			displayNumbers(0);
		} else if (index == 2) {
			displayNumbers(1);
		} else {

			if (firstTime) {
				try {
					Thread.sleep(500);
					System.out.println(1);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			double n1 = 0, n2 = 1;
			for (int i = 2; i < index; i++) {
				isPrinted = false;
				fn = n1 + n2;
				n1 = n2;
				n2 = fn;

				while (!isPrinted) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
			displayNumbers(fn);
		}

	}

	public void displayNumbers(double fn) {
		System.out.println("The number is: " + fn);
	}

}

class ExternClass extends Thread {

	public ExternClass() {
		setDaemon(true);
	}

	@Override
	public void run() {
		while (true) {
			while (Fibonacci.isPrinted) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println(Fibonacci.fn);
			Fibonacci.isPrinted = true;
		}
	}
}
