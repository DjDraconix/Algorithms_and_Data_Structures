
public class WordOccurrence implements Comparable<WordOccurrence>{

	String word;
	int count = 0;
	
	WordOccurrence(String wordIn) {
		word = wordIn;
		count++;
	}
	
	public String getWord() {
		return word;
	}
	
	public int getCount() {
		return count;
	}
	
	public void incCount() {
		count++;
	}
	
	@Override
	public int compareTo(WordOccurrence newOccurrence) {
		if (count > newOccurrence.getCount()) {
			return 1;
		} else if (count < newOccurrence.getCount()) {
			return -1;
		} else {
			return 0;
		}
	}
}
