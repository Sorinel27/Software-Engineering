//lab 2 problema 2 Fratean Sorin, grupa 2022
import java.util.Scanner;

public class clasaTest {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner numar = new Scanner(System.in);
		int n = numar.nextInt();
		long ok = 1;
		for(int i = 1; i <= n; i++)
			ok *= i;
		System.out.println("Factorial of the number " + n + " is: " + ok);
	}

}
