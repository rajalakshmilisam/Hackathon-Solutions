package level2;

import java.util.Random;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter S1: ");
		String S1 = sc.nextLine().toUpperCase();

		loadMatrix(S1);
	}

	public static void loadMatrix(String S1) {
		char[][] matrix = new char[S1.length()][S1.length()];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				matrix[i][j] = ' ';
			}
		}

		for (int i = 0; i < S1.length(); i++) {
			char currentChar = S1.charAt(i);
			matrix[i][i] = currentChar;
			matrix[S1.length() - 1 - i][i] = currentChar;
		}

		Random random = new Random();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == ' ') {
					matrix[i][j] = (char) ('A' + random.nextInt(26));
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}