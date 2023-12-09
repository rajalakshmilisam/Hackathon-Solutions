package level1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter S1(first letter should be capital): ");
		String s1 = sc.nextLine();

		if (isValidMessage(s1)) {
			System.out.println("Message Valid");
		} else {
			System.out.println("Message invalid");
		}
	}

	public static boolean isValidMessage(String message) {

		char[] ch = message.toCharArray();
		boolean hashSymbol = false;
		for (int i = 1; i < ch.length; i += 2) {
			ch[i] = '#';
			break;
		}

		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '#') {
				count++;
				if (count == 1) {
					ch[i + 1] = '$';
				} else if (count == 2) {
					ch[i + 1] = '$';
					break;
				}
			}
		}

		return hashSymbol && count == 2 && (countVowels(ch) % 2 == 0) && message.endsWith("WYR")
				|| message.endsWith("PWQ") || (!message.contains("WYR") && !message.contains("PWQ"));
	}

	private static int countVowels(char[] ch) {
		int count = 0;
		for (char c : ch) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;
			}
		}
		return count;
	}
}
