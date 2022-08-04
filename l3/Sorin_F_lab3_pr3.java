//lab 3 problema 3 Fratean Sorin, grupa 2022
import java.util.Scanner;

public class clasaTest {

	public static void main(String[] args) {
		System.out.println("Enter a value: ");
		Scanner value= new Scanner(System.in);
		String str = value.nextLine();
		char[] chr1 = str.toCharArray();
		char[] chr2 = {'a', 'b', 'c', 'd', 'e', 'f'};
		if(chr1.length >= 3) {
		System.arraycopy(chr1, 0, chr2, 0, 3);
		}
		for(int i = 0; i < chr2.length; ++i)
			System.out.print(chr2[i] + " ");
	}
}
