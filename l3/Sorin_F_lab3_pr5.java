//lab 3 problema 5 Fratean Sorin, grupa 2022
import java.util.Scanner;

public class clasaTest {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements: ");
		Scanner value= new Scanner(System.in);
		int n = value.nextInt();
		System.out.println("Enter the " + n + " elements: ");
		int[] a = new int[500000];
		for(int i = 0; i < n; ++i)
			a[i] = value.nextInt();
		int aux = 0;
		for(int i = 0; i < n; ++i)
			for(int j = i + 1; j < n; ++j)
			{
				if(a[i] > a[j])
				{
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}
		for(int i = 0; i < n; ++i)
			System.out.println(a[i]);
	}
}
