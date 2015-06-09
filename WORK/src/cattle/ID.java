package cattle;

import java.util.Scanner;

class ID {
	public static String HERD_IDENTIFIER = "3010658";

	public static void main(String args[]) {
		int i;
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		in.close();
		System.out.println(HERD_IDENTIFIER + "" + computeTagNumber(i)
				+ padNumber(i));
	}

	private static int computeTagNumber(int numberToCheck) {
		return (numberToCheck % 9) + 1;
	}

	private static String padNumber(int numberToCheck) {
		String s = null;
		if (numberToCheck >= 10 && numberToCheck < 100) {
			s = "00" + String.valueOf(numberToCheck);
		} else if (numberToCheck >= 100 && numberToCheck < 1000) {
			s = "0" + String.valueOf(numberToCheck);
		} else if (numberToCheck < 10) {
			s = "000" + String.valueOf(numberToCheck);
		} else {
			s = String.valueOf(numberToCheck);
		}
		return s;
	}
}
