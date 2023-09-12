import java.util.Scanner;

public class Exercise22_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userString = in.next();
		userString.toLowerCase();
		Character[] userChars = new Character[userString.length()];
		int[] charValue = new int[userString.length()];
		for (int i = 0; i < userString.length(); i++) {
			userChars[i] = userString.charAt(i);
			charValue[i] = Character.getNumericValue(userChars[i]);
		}
		int[][] sequences = new int[userString.length()][26];
		int sequenceNum = 0;
		for (int i = 0; i < charValue.length; i++) {
			if(charValue[i] == 10) {
				sequences[sequenceNum][0] = 10;
				int run = 1;
				for (int j = i + 1; j < charValue.length; j++) {
					if(charValue[j] == 10 + run) {
						sequences[sequenceNum][run] = (10 + run);
						run++;
					}
				}
				sequenceNum++;
			}
		}

		in.close();
	}

}
