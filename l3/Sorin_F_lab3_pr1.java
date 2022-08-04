//lab 3 problema 1 Fratean Sorin, grupa 2022
import java.util.Scanner;

public class clasaTest {

	public static void main(String[] args) {
		System.out.println("Enter a value: ");
		Scanner value= new Scanner(System.in);
		String str = value.nextLine();
		int isString = 0;
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		for(int i = 0; i < months.length; ++i)
			if(str.equals(months[i]) == true) {
				isString = 1;
				System.out.println((i + 1));
			}
		if(isString == 0) {
			Integer number = Integer.valueOf(str);
			for(int i = 0; i < months.length; ++i)
				if(number == i + 1) {
					System.out.println(months[i]);
				}
		}
		
	}

}
