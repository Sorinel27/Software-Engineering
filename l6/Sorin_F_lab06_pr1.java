//lab 6 problema 1 Fratean Sorin, grupa 2022
//import java.util.Random;
import java.util.Scanner;
import java.lang.Exception;

public class clasaTest{
		public void sir(int n, Scanner scanner) throws ArrayIndexOutOfBoundsException{

			double valori[] = new double[5];
			for(int i = 0; i < n; ++i){
				valori[i] = Double.parseDouble(scanner.nextLine());
			}
			System.out.println("Enter an index: ");
			int index = 0;
			index = Integer.parseInt(scanner.nextLine());
			System.out.print("Your number on index " + index + " is: ");
			
			try {
				System.out.print(valori[index] + "\n");		
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("An element has a negative index or an index greater than the maximum number of elements");
			} 
		}

		public static void main(String[] args){
			int n;
			clasaTest tester = new clasaTest();
			Scanner scanner = new Scanner(System.in);

			System.out.println("How many numbers?: ");
			n = Integer.parseInt(scanner.nextLine()); 
			try {
				tester.sir(n, scanner);
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("An element has a negative index or an index greater than the maximum number of elements");
			} 
			finally {
				System.out.println("finally..");
	        }
		}
}
