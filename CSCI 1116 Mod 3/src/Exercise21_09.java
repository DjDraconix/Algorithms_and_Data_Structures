import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise21_09 {
	public static void main(String[] args) {
		String[][] stateCapital = {
				{"Alabama", "Montgomery"},
				{"Alaska", "Juneau"},
				{"Arizona", "Phoenix"},
				{"Arkansas", "Little Rock"},
				{"California", "Sacramento"},
				{"Colorado", "Denver"},
				{"Connecticut", "Hartford"},
				{"Delaware", "Dover"},
				{"Florida", "Tallahassee"},
				{"Georgia", "Atlanta"},
				{"Hawaii", "Honolulu"},
				{"Idaho", "Boise"},
				{"Illinois", "Springfield"},
				{"Indiana", "Indianapolis"},
				{"Iowa", "Des Moines"},
				{"Kansas", "Topeka"},
				{"Kentucky", "Frankfort"},
				{"Louisiana", "Baton Rouge"},
				{"Maine", "Augusta"},
				{"Maryland", "Annapolis"},
				{"Massachusettes", "Boston"},
				{"Michigan", "Lansing"},
				{"Minnesota", "Saint Paul"},
				{"Mississippi", "Jackson"},
				{"Missouri", "Jefferson City"},
				{"Montana", "Helena"},
				{"Nebraska", "Lincoln"},
				{"Nevada", "Carson City"},
				{"New Hampshire", "Concord"},
				{"New Jersey", "Trenton"},
				{"New York", "Albany"},
				{"New Mexico", "Santa Fe"},
				{"North Carolina", "Raleigh"},
				{"North Dakota", "Bismarck"},
				{"Ohio", "Columbus"},
				{"Oklahoma", "Oklahoma City"},
				{"Oregon", "Salem"},
				{"Pennsylvania", "Harrisburg"},
				{"Rhode Island", "Providence"},
				{"South Carolina", "Columbia"},
				{"South Dakota", "Pierre"},
				{"Tennessee", "Nashville"},
				{"Texas", "Austin"},
				{"Utah", "Salt Lake City"},
				{"Vermont", "Montpelier"},
				{"Virginia", "Richmond"},
				{"Washington", "Olympia"},
				{"West Virginia", "Charleston"},
				{"Wisconsin", "Madison"},
				{"Wyoming", "Cheyenne"}
		};

		Scanner input = new Scanner(System.in);

		Map<String, String> states = new TreeMap<>();

		for (int i = 0; i < stateCapital.length; i++) {
			states.put(stateCapital[i][0], stateCapital[i][1]);
		}

		boolean run = true;

		while (run) {
			System.out.println("Please enter a state or enter \"Exit\" to end program");
			String userIn = input.next();
			if(userIn.equalsIgnoreCase("Exit")) {
				run = false;
			} else {
				if(states.containsKey(userIn)) {
					System.out.println(states.get(userIn) + " is the capital of " + userIn);
				}
			}
		}
		System.out.println("Come again soon");
		input.close();
	}
}
