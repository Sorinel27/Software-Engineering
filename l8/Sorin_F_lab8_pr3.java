package test;
//lab 8 problema 3 Fratean Sorin, grupa 2022

// IsKeyPressed class


public class IsKeyPressed {

	private static volatile boolean xPressed = false;
    public static boolean isXPressed() {
        synchronized (IsKeyPressed.class) {
            return xPressed;
        }
    }

    public static void main(String[] args) {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {

            @Override
            public boolean dispatchKeyEvent(KeyEvent ke) {
                synchronized (IsKeyPressed.class) {
                    switch (ke.getID()) {
                    case KeyEvent.KEY_PRESSED:
                        if (ke.getKeyCode() == KeyEvent.VK_X) {
                            xPressed = true;
                        }
                        break;

                    case KeyEvent.KEY_RELEASED:
                        if (ke.getKeyCode() == KeyEvent.VK_X) {
                            xPressed = false;
                        }
                        break;
                    }
                    return false;
                }
            }
        });
    }

}


// main class

//import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class clasaTest{
    public static void main(String[] args) {
    	Scanner value = new Scanner(System.in);
    	IsKeyPressed obj = new IsKeyPressed();
    	do { 		
    		System.out.println("Enter the format DD/MM/YYYY:");
        	String date = value.nextLine();
        	String day = new String();
        	String month = new String();
        	String year = new String();
        	day = date.substring(0, 2);
        	month = date.substring(3, 5);
        	year = date.substring(6, 10);
        	if(month.equals("01"))
        		month = "January";
        	if(month.equals("02"))
        		month = "February";
        	if(month.equals("03"))
        		month = "March";
        	if(month.equals("04"))
        		month = "April";
        	if(month.equals("05"))
        		month = "May";
        	if(month.equals("06"))
        		month = "June";
        	if(month.equals("07"))
        		month = "July";
        	if(month.equals("08"))
        		month = "August";
        	if(month.equals("09"))
        		month = "September";
        	if(month.equals("10"))
        		month = "October";
        	if(month.equals("11"))
        		month = "November";
        	if(month.equals("12"))
        		month = "December";
        	int yearInteger = Integer.parseInt(year);
        	System.out.print(day + " " + month + " " + year + "\n");
        	if(isLeap(yearInteger)) {
        		System.out.println("Year " + year + " is leap." );
        	}
        	else {
        		System.out.println("Year " + year + " is not leap." );
        	}
    	
    	}
    	while(IsKeyPressed.isXPressed() == false);
    }
    static boolean isLeap(int year) {
    	if(year % 4 != 0) {
    		return false;
    	}
    	else if(year % 100 != 0) {
    		return true;
    	}
    	else if(year % 400 != 0) {
    		return false;
    	}
    	return true;
    }
}



