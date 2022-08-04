//lab 6 problema 2 Fratean Sorin, grupa 2022
//import java.util.Random;
import java.util.Scanner;
import java.lang.Exception;
import java.lang.Math;

class clasaTest {
	public void prod(int n, Scanner scanner) throws ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException {
		int values[] = new int[10];
		int product = 1;
		for(int i = 0; i < n; i++){
			values[i] = Integer.parseInt(scanner.nextLine());
		}
		for(int i = 0; i < n; i++){
			product += values[i];
		}
		for(int i = n - 1; i <= 0; --i) {
			if(values[i] != 0) {
				System.out.println("Division between the last and first: " + (values[i] / values[0]));
				break;
			}
		}
		System.out.println("Product of the numbers: "+ product);
	}
	public static void main(String... args){
		int n;
		clasaTest tester = new clasaTest();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers? ");
		n = Integer.parseInt(scanner.nextLine());
		try {
			tester.prod(n, scanner);
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic error!");
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid value entered!");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Too many numbers!");
		}
		finally {
			System.out.println("I may or may not have caught an exception.");
		}
	 }
}