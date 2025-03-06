public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean validIndex(int[] intArr, int num) {
		try {
			int temp = intArr[num];
			return true;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			return false;

		}

	}
	public static int divide(int num2, int num3) {
		try {
			return num2 / num3;
		}
		catch (ArithmeticException e) {
			return 0;
		}
	}
	public static int safeConvertStringtoInt(String word) {
		try {
			return Integer.parseInt(word);
		}
		catch (NumberFormatException e) {
			return 0;
		}
		

	}

	

}
