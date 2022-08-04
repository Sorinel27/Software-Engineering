//lab 2 problema 3 Fratean Sorin, grupa 2022
import java.util.Scanner;

public class clasaTest {

	public static void main(String[] args) {
		System.out.println("Enter the first number: ");
		Scanner numar = new Scanner(System.in);
		int n = numar.nextInt();
		System.out.println("Enter the second number: ");
		int m = numar.nextInt();
		int gcd = 0;
		if(n > m) {
			for(int i = n; i >= 1; --i)
				if(m % i == 0 && n % i == 0) {
					gcd = i;
					break;
				}
		}
		else {
			for(int i = m; i >= 1; --i)
				if(m % i == 0 && n % i == 0) {
					gcd = i;
					break;
				}
		}
		System.out.println("The gcd is " + gcd);
	}

}