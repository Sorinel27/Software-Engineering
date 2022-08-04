//lab 5 problema 1.3 Fratean Sorin, grupa 2022
//import java.util.Random;
import java.util.Scanner;
import java.lang.Exception;
import java.lang.Math;

interface sum{
	void method1(double a, double b);
}
interface sub{
	void method2(double a, double b);
}
interface multi{
	void method3(double a, double b);
}
interface div{
	void method4(double a, double b);
}
public class clasaTest {
	static sum m1 = (a, b) -> System.out.println(a + " + " + b + " = " + (a + b));
	static sub m2 = (a, b) -> System.out.println(a + " - " + b + " = " + (a - b));
	static multi m3 = (a, b) -> System.out.println(a + " * " + b + " = " + (a * b));
	static div m4 = (a, b) -> System.out.println(a + " / " + b + " = " + (a / b));
	public static void main(String args[ ]) {
		System.out.println("Enter the first number: ");
        Scanner value= new Scanner(System.in);
        double n = value.nextDouble();
        System.out.println("Enter the second number: ");
        double m = value.nextDouble();
        m1.method1(n, m);
        m2.method2(n, m);
        m3.method3(n, m);
        m4.method4(n, m);
	}
}
