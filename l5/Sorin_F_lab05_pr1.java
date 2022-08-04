//lab 5 problema 1 Fratean Sorin, grupa 2022
//import java.util.Random;
import java.util.Scanner;
import java.lang.Exception;
import java.lang.Math;

interface MathOperation_d {
	double operation_d(double a, double b);
}
public class clasaTest {
private double operate_d(double a, double b, MathOperation_d mathOperation) {
	return mathOperation.operation_d(a, b);
	}
	public static void main(String args[ ]) {
		clasaTest tester = new clasaTest();
		System.out.println("Enter the first number: ");
        Scanner value= new Scanner(System.in);
        double n = value.nextDouble();
        System.out.println("Enter the second number: ");
        double m = value.nextDouble();
		MathOperation_d addition = (var a, var b) -> a + b;
		MathOperation_d sub = (var a, var b) -> a - b;
		MathOperation_d multi = (var a, var b) -> a * b;
		MathOperation_d division = (var a, var b) -> a / b;
		MathOperation_d squareRoot = (var a, var b) -> Math.sqrt(n);
		MathOperation_d power = (var a, var b) -> Math.pow(n, m);
		System.out.println(n + " + " + m + " = " + tester.operate_d(n, m, addition));
		System.out.println(n + " - " + m + " = " + tester.operate_d(n, m, sub));
		System.out.println(n + " * " + m + " = " + tester.operate_d(n, m, multi));
		try {
			System.out.println(n + " / " + m + " = " + tester.operate_d(n, m, division));
		} 
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot divide by 0.");
    	}
		System.out.println("Square root " + n + " = " + tester.operate_d(n, m, squareRoot));
		System.out.println(n + " ^ " + m + " = " + tester.operate_d(n, m, power));
	}
}
