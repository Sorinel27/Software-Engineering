//lab 8 problema 1 Fratean Sorin, grupa 2022
//import java.util.Random;
import java.util.Scanner;
import java.lang.Exception;
import java.lang.Math;
import java.io.*;

public class clasaTest{
	public static void main (String[] args){
		String message = new String();
		String month = new String();
		int day, year;
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Message: ");
			message = reader.readLine();
			System.out.println("The message is: " + message);
			System.out.println("Day:");
			day = Integer.parseInt(reader.readLine());
			System.out.println("The day: " + day);
			System.out.println ("Month: ");
			month = reader.readLine();
			System.out.println("The month: " + month);
			System.out.println("Year");
			year = Integer.parseInt(reader.readLine());
			System.out.println("The year: " + year);
			reader.close();
		}
		catch(IOException e){
			System.out.println("Reading error" + e);
		}
	}
