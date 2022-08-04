//lab 9 problema 1 Fratean Sorin, grupa 2022
//import java.util.Random;
import java.util.Scanner;

class Run implements Runnable {
	String nume;
	static int k = 0;

	public Run(String nume) {
		this.nume = nume;
		k++;
	}

	@Override
	public void run() {
		for (int i = 0; i < k; i++) {
			try {
				System.out.println(nume);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class clasaTest {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter a name: ");
		String input = value.next();
		Thread first = new Thread(new Run(input));

		System.out.print("Enter a name: ");
		input = value.next();
		Thread second = new Thread(new Run(input));

		System.out.print("Enter a name: ");
		input = value.next();
		Thread third = new Thread(new Run(input));

		first.start();
		second.start();
		third.start();
	}

}

