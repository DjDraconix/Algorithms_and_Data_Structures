import java.util.Scanner;

public class Exercise22_03 {
	
	//This program should run O(n^2) due to the nested loop 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string s1: ");
		String s1 = in.nextLine();
		char[] s1Chars = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++)
			s1Chars[i] = s1.charAt(i);
		
		System.out.print("Enter a string s2: ");
		String s2 = in.nextLine();
		char[] s2Chars = new char[s2.length()];
		for (int i = 0; i < s2.length(); i++)
			s2Chars[i] = s2.charAt(i);
		
		int index = 0;
	
		if (s1.contains(s2)) {
			for (int i = 0; i < s1Chars.length; i++) {
				if (s1Chars[i] == s2Chars[0]) {
					boolean matching = true;
					int j = i + 1;
					int k = 1;
					while (matching) {
						if(s1Chars[j] == s2Chars[k]) {
							j++;
							k++;
						} else {
							matching = false;
						}
						if (k == s2Chars.length) {
							index = i;
							matching = false;
						}
					}
				}
			}
			
			System.out.println("Mathced at index " + index);
		} 
		
		else System.out.println("There is no match");
		
		in.close();
	}

}
