//lab 5 problema 1.2 Fratean Sorin, grupa 2022
//import java.util.Random;
import java.util.Scanner;
import java.lang.Exception;
import java.lang.Math;

interface sum{
	void method1();
}
interface sub{
	void method2();
}
interface multi{
	void method3();
}
interface div{
	void method4();
}
class Calc implements sum, sub, multi, div{
	
	public double method1(double a, double b){
		return a + b;
	}
	public double method2(double a, double b){
		return a - b;
	}
	public double method3(double a, double b){
		return a * b;
	}
	public double method4(double a, double b){
		return a / b;
	}
	@Override
	public void method4() {
	}
	@Override
	public void method3() {
	}
	@Override
	public void method2() {
	}
	@Override
	public void method1() {
	}
}

public class clasaTest {
	public static void main(String args[ ]) {
		Calc ob1 = new Calc();
		System.out.println("Enter the first number: ");
        	Scanner value= new Scanner(System.in);
        	double n = value.nextDouble();
       		System.out.println("Enter the second number: ");
        	double m = value.nextDouble();
        	System.out.println(n + " + " + m + " = " + ob1.method1(n, m));
        	System.out.println(n + " - " + m + " = " + ob1.method2(n, m));
        	System.out.println(n + " * " + m + " = " + ob1.method3(n, m));
        	System.out.println(n + " / " + m + " = " + ob1.method4(n, m));
	}
}