package day5;

class AnagramListStructure{	
	List<String> anagramList;
	int score;
	
	AnagramListStructure(String word)
	{
		score = calculateScore(word);
		anagramList = new ArrayList<String>();
		anagramList.add(word);
	}
}