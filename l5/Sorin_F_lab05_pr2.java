//lab 5 problema 2 Fratean Sorin, grupa 2022
//import java.util.Random;
import java.util.Scanner;
import java.lang.Exception;
import java.lang.Math;

interface GeometricForm{
	double method1Square(double l);
	double method2Rect(double n, double m);
	double method3Circle(double r);
	double method4Trieq(double l);
	double method5TriIs(double l, double b);
}
class Forms implements GeometricForm{
    
    public double method1Square(double l){
            return Math.sqrt(l);
    }
    public double method2Rect(double n, double m){
            return n * m;
    }
    public double method3Circle(double r){
            return  3.14 * r * r;
    }
    public double method4Trieq(double l){
        return (l*l * Math.sqrt(3) )/ 4;    
    }
    public double method5TriIs(double l, double b){
       
    }
}
public class clasaTest {
	public static void main(String args[ ]) {
		Forms ob1 = new Forms();
        Scanner value= new Scanner(System.in);
        System.out.println("Square l: ");
        double lSq = value.nextDouble();
        System.out.println("Rectangle l1: ");
        double l1Rect = value.nextDouble();
        System.out.println("Rectangle l2: ");
        double l2Rect = value.nextDouble();
        System.out.println("Radius r: ");
        double r = value.nextDouble();
        System.out.println("Triangle eq side: ");
        double l = value.nextDouble();	
        System.out.println("Triangle isosceles sides: ");
        double is = value.nextDouble();
        System.out.println("Triangle is base side: ");
        double bIs = value.nextDouble();
        System.out.println("Sq = " + ob1.method1Square(lSq));
        System.out.println("Sq = " + ob1.method2Rect(l1Rect, l2Rect));
        System.out.println("Sq = " + ob1.method3Circle(r));
        System.out.println("Sq = " + ob1.method4Trieq(l));
	}
}
