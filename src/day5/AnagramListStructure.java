package day5;

import java.util.*;

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
