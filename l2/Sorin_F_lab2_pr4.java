//lab 2 problema 4 Fratean Sorin, grupa 2022
import java.util.Scanner;

public class clasaTest {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner numar = new Scanner(System.in);
		int n = numar.nextInt();
		System.out.println("The dividers of " + n + ":");
		for(int i = 1; i <= n; ++i)
			if(n % i == 0)
				System.out.println(i);
	}

}
