package level0;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkNumberMultiple(84378857500l, 2);

	}

	public static void checkNumberMultiple(long N1, int N2) {

		int newNumber = 0;
		int multiplier = 1;

		while (N1 > 0) {
			int digit = (int) (N1 % 10);
			if (digit % N2 == 0) {
				newNumber = digit * multiplier + newNumber;
				multiplier *= 10;
			}
			N1 /= 10;
		}

		System.out.println(newNumber);
	}
}
