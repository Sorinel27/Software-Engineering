//lab 9 problema 1 Fratean Sorin, grupa 2022
import java.util.Random;
import java.util.Arrays;
public class clasaTest {

	public static void main(String[] args) {

		try {
			Number number = new Number();
			Thread numbeThread = new Thread(number);
			numbeThread.start();

			Circle circle = new Circle(number);
			Thread circleThread = new Thread(circle);
			circleThread.start();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Number implements Runnable {
	int[] numbers = new int[30];

	public Number() {}

	@Override
	public void run() {
		generateNumbers();
		displayNumbers();
	}

	public void generateNumbers() {
		Random rand = new Random();
		for (int i = 0; i < 30; i++) {
			numbers[i] = rand.nextInt(30) + 1;
		}
	}

	public void displayNumbers() {
		System.out.println("Array: " + Arrays.toString(numbers));
	}

}

class Circle implements Runnable {
	Number nr; 

	public Circle(Number nr) {
		this.nr = nr;
	}

	public void calculateArea(int[] array) { 
		int numberOfCircle = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				numberOfCircle++;
				System.out.print("\nCircle[" + numberOfCircle + "] area is: " + Math.PI * Math.pow(array[i], 2));
			}
		}

	}

	@Override
	public void run() {
		calculateArea(nr.numbers);
	}
}