//lab 6 problema 4 Fratean Sorin, grupa 2022
//import java.util.Random;
import java.util.Scanner;
import java.lang.Exception;
import java.lang.Math;

	class SmallerException extends SuperException {
		public SmallerException(String message) {
			super("Smaller exception!!");
		}
	}
	class SuperException extends Exception {
		public SuperException(String message) {
			super("Super exception!!");
		}
	}
	class Throw {
		void a() {
			try {
				throw new SmallerException("Error occured in a() method!");
			} 
			catch (SmallerException e) {
				e.printStackTrace();
			}
		}
		void b() {
			try {
				throw new SuperException("Error occured in b() method!");
			} catch (SuperException e) {
				e.printStackTrace();
			}
		}
	}
	public class clasaTest {
		public static void main(String[] args) {
			Throw object = new Throw();
			object.a();
			object.b();
		}
	}
