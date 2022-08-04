//lab 6 problema 3 Fratean Sorin, grupa 2022
import java.util.Scanner;
import java.lang.Exception;
import java.lang.Math;

class clasaTest {
	public interface Int1 {
		int a = 0, b = 0;
		int sum();
	}
	public interface Int2 {
		double a = 0, b = 0;
		double product();
	}
	public abstract class Class1 implements Int1, Int2 {
		protected double a, b;

		public Class1(double a, double b) {
			this.a = a;
			this.b = b;
		}
		public double getA() {
			return a;
		}
		public double getB() {
			return b;
		}
		public void setA(double a) {
			this.a = a;
		}
		public void setB(double b) {
			this.b = b;
		}
	}
	public class Class2 extends Class1 {

		public Class2(double a, double b) {
			super(a, b);
		}

		@Override
		public int sum() {
			return (int) (a + b);
		}

		@Override
		public double product() {
			return a * b;
		}

	}
	public class Main {
		public static void main(String[] args) {
			Scanner value = new Scanner(System.in);
			System.out.println("Enter 2 numbers: ");
			double a = value.nextDouble();
			double b = value.nextDouble();
			Class2 ob1 = new Class2(a, b);
			System.out.println("The sum of the numbers is: " + ob1.sum());
			System.out.println("The product of the number is: " + ob1.product());
		}
	}
}