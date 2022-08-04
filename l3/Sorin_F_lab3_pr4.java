//lab 3 problema 4 Fratean Sorin, grupa 2022
import java.util.Scanner;

public class clasaTest {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner value= new Scanner(System.in);
		int n = value.nextInt();
		System.out.println("Binary: " + Integer.toBinaryString(n));
		System.out.println("Octal: " + Integer.toOctalString(n));
		System.out.println("Hexadecimal: " + Integer.toHexString(n));
	}
}
