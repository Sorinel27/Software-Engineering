//lab 3 problema 2 Fratean Sorin, grupa 2022
import java.util.Scanner;

public class clasaTest {

	public static void main(String[] args) {
		System.out.println("Enter a value: ");
		Scanner value= new Scanner(System.in);
		String str = value.nextLine();
		System.out.println("Enter a character: ");
		String k = value.nextLine();
		char c = k.charAt(0);
		int count = 0;
		char[] chr = str.toCharArray();
		for(int i = 0; i < chr.length; ++i){
			if(c == chr[i])
			{
				count++;
			}
		}
		System.out.println("The character " + k + " appears in a number of: " + count);
		
	}

}
