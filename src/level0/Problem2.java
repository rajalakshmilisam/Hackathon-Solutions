package level0;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stringTransformer();

	}

	public static void stringTransformer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter S1: ");

		String S1 = sc.next();

		String S2 = "";
		String S3 = "";
		String S4 = "";
		for (int i = 0; i < S1.length(); i++) {
			if (i % 2 == 0) {
				S2 += S1.charAt(i);
			} else {
				char c = S1.charAt(i);
				if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
					S3 += c;
				}
			}
		}

		S4 = S2 + S3;

		System.out.println("Even index of S1: " + S2);
		System.out.println("Odd index of S1: " + S3);
		System.out.println("Concatenation of S2 and S3: " + S4);
	}
}
