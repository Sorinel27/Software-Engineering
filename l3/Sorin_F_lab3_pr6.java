//lab 3 problema 6 Fratean Sorin, grupa 2022
import java.util.Scanner;
import java.util.Random;

public class clasaTest {

	public static void main(String[] args) {
		Random r = new Random();
		int vMax = 1000;
		float n1 = r.nextFloat(vMax);
		float n2 = r.nextFloat(vMax);
		float k = n1 / n2;
		System.out.println("The 2 values randomly generated are " + n1 + " and " + n2);
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
		System.out.println(n1 + " / " + n2 + " = " + k);
	}
}
