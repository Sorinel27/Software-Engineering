package test;
//lab 8 problema 6 Fratean Sorin, grupa 2022
//import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class clasaTest{
    public static void main(String[] args) throws Exception{
    	String csv = "E:\\Facultate\\AN II\\sem ii\\SE\\LABS\\l8\\input_pb6.csv";
    	String split = ",";
    	String l = "";
    	BufferedReader buff = new BufferedReader(new FileReader(csv));
    		
    	File december = new File("december.txt");
    	File numbers = new File("numbers.txt");
    	File nameAN = new File("name.txt");
    	File facebook = new File("facebook.txt");
    	
    	boolean i = false, u = false, o = false, p = false;
    	
    	l = buff.readLine();
    	
    	while(l != null) {
    		String[] data = l.split(split);
    		if (data[3].contains(".12.")) { 
				if (i == false) {
					december.createNewFile();
					i = true;
				}
				FileWriter fw = new FileWriter(december, true);
				fw.write(l);
				fw.close();
			}

			if (data[2].charAt(2) != '4' || data[2].charAt(3) != '4' && data[2].charAt(1) != 'n') {
				if (u == false) {
					numbers.createNewFile();
					u = true;
				}
				FileWriter fw = new FileWriter(numbers, true);
				fw.write(l);
				fw.close();
			}

			if (data[1].contentEquals("Andrei") || data[1].contentEquals("Nicolae")) {
				if (o == false) {
					nameAN.createNewFile();
					o = true;
				}
				FileWriter fw = new FileWriter(nameAN, true);
				fw.write(l);
				fw.close();
			}

			if (data[4].contains("/profile.php?id=")) {
				if (p == false) {
					p = true;
					facebook.createNewFile();
				}
				FileWriter fw = new FileWriter(facebook, true);
				fw.write(l);
				fw.close();
			}

			l = buff.readLine();
		}

		buff.close(); 
		
		System.out.println("Done! :)");
    }

}



