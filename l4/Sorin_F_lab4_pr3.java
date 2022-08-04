//lab 4 problema 3 Fratean Sorin, grupa 2022
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class matrix {
	private int[][] a;
	private int row, column;

	public matrix(int row, int column) {
		this.row = row;
		this.column = column;
		this.a = new int[this.column][this.row];
		generateMatrix();
	}

	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public void generateMatrix() {
		Random r = new Random();
		for (int i = 0; i < getRow(); i++) {
			for (int j = 0; j < getColumn(); j++) {
				a[i][j] = r.nextInt(100);
			}
		}
	}
	public void displayMatrix() {
		System.out.println("The matrix is: \n");
		for(int i = 0; i < getRow(); ++i) {
			for(int j = 0; j < getColumn(); ++j) {
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	public void sumOfElements() {
		int sum = 0;
		for (int i = 0; i < getRow(); i++) {
			for (int j = 0; j < getColumn(); j++) {
				sum += a[i][j]; 
			}
		}
		System.out.println("The sum of the elements: " + sum);
	}
	public void isEven() {
		System.out.println("The even elements of the matrix are: \n");
		for(int i = 0; i < getRow(); ++i) {
			for(int j = 0; j < getColumn(); ++j) {
				if(a[i][j] % 2 == 0) 
					System.out.print(a[i][j] + " ");
				else
					System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	public void isOdd() {
		System.out.println("The odd elements of the matrix are: \n");
		for(int i = 0; i < getRow(); ++i) {
			for(int j = 0; j < getColumn(); ++j) {
				if(a[i][j] % 2 != 0) 
					System.out.print(a[i][j] + " ");
				else
					System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
}

public class clasaTest{
	
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);

		System.out.print("Rows: ");
		int n = value.nextInt();
		System.out.print("Columns: ");
		int m = value.nextInt();
		matrix obj = new matrix(n, m);
		obj.generateMatrix();
		obj.displayMatrix();
		obj.sumOfElements();
		obj.isEven();
		obj.isOdd();
	}
}