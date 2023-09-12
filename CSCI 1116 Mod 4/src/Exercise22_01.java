import java.util.ArrayList;
import java.util.Scanner;

public class Exercise22_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userString = in.next();
		userString.toLowerCase();
		Character[] userChars = new Character[userString.length()];
		for (int i = 0; i < userString.length(); i++) {
			userChars[i] = userString.charAt(i);
		}

		int arrayNum = 0;
		ArrayList<ArrayList<Character>> sequences = new ArrayList<>();
		int i = 0;
		ArrayList<Character> temp = new ArrayList<>();
		while (i < userChars.length) {
			if (i == 0 || userChars[i - 1] < userChars[i]) {
				temp.add(userChars[i]);
				i++;
			} else {
				sequences.add(temp);
				temp = new ArrayList<>();
				temp.add(userChars[i]);
				i++;
			}
			if(i == userChars.length) {
				sequences.add(temp);
			}
		}
		
		for(int k = 1; k < sequences.size(); k++) {
			if(sequences.get(k).size() > sequences.get(arrayNum).size())
				arrayNum = k;
			
		}
		
		System.out.println("Maximum cosecutive substring is " + sequences.get(arrayNum));

		in.close();
	}

}
