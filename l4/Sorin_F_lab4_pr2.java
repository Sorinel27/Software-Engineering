//lab 4 problema 2 Fratean Sorin, grupa 2022
import java.util.Arrays;
import java.util.Scanner;

class X {
	private char[] a;
	protected String s;
	int n;

	public X(String s, char[] a, int n) {
		this.s = s;
		this.a = a;
		this.n = n;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("garbage collected : " + this); 
	}

	public char[] getA() {
		return a;
	}

	public void setA(char[] a) {
		this.a = a;
	}
}

public class clasaTest{
	
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);

		System.out.print("Enter 7 characters: ");
		char[] a = new char[7];
		for (int i = 0; i < 7; i++) {
			a[i] = value.next().charAt(0);
		}
		
		System.out.print("Enter a string: ");
		String s = value.next();

		System.out.print("Enter a number: ");
		int n = value.nextInt();
		X object = new X(s, a, n);
		System.out.println("The values are: " + object.n + ", " + object.s + ", " + Arrays.toString(object.getA()));
		object = null;
		System.gc();
	}

}