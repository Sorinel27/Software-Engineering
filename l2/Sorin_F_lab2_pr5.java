//lab 2 problema 5 Fratean Sorin, grupa 2022
import java.util.Scanner;

public class clasaTest {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements: ");
		Scanner value= new Scanner(System.in);
		int n = value.nextInt();
		int[] a = new int[500000];
		for(int i = 1; i <= n; ++i)
			a[i] = value.nextInt();
		int numDiv = 0;
		System.out.println("The prime numbers are: ");
		for(int i = 1; i <= n; ++i) {
			if(a[i] == 1)
				continue;
			for(int j = 1; j <= a[i]; ++j)
				if(a[i] % j == 0)
					numDiv++;
			if(numDiv < 3)
				System.out.println(a[i]);
			numDiv = 0;
		}
			
	}
}
