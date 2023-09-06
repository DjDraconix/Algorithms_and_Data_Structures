import java.util.*;

public class Exercise21_07 {
	public static void main(String[] args) {
		ArrayList<WordOccurrence> collections = new ArrayList<>();
		
		// Set text in a string
		String text = "Good morning. Have a good class. " +
			"Have a good visit. Have fun!";

		// Create a TreeMap to hold words as key and count as value
		Map<String, Integer> map = new TreeMap<>();

		String[] words = text.split("[\\s+\\p{P}]");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			
			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
					collections.add(new WordOccurrence(key));
				}
				else {
					int value = map.get(key);
					value++;
					map.put(key, value);
					for (int j = 0; j < collections.size(); j++) {
						if (collections.get(j).getWord().equals(key))
							collections.get(j).incCount();						
					}
				}
			}
		}
		collections.sort(null);
		
		for (int i = 0; i < collections.size(); i++) {
			System.out.println(collections.get(i).getWord() + "\t" + collections.get(i).getCount());
		}
	}
}