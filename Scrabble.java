import java.util.*;
import java.io.*;

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
class ScrabbleHelper
{
	Map <String, AnagramListStructure> anagramMap;
	
	ScrabbleHelper()
	{
		Map <String, AnagramListStructure> anagramMap = new HashMap<String, AnagramListStructure>();
		File file = new File("sowpods.txt");
		if (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			String word;
			String key = calculateKey(word);
			AnagramListStructure anagramListStructure;
			if(anagramMap.containsKey(word)){
				anagramListStructure = anagramMap.get(key);
				anagramListStructure.anagramList.add(word);
			}
			else{
				anagramListStructure = new AnagramListStructure(word);
				anagramMap.put(key, anagramListStructure);
			}
		}
	}
	
	String calculateKey(String word)
	{
        char[] charsInWord = original.toCharArray();
        Arrays.sort(charsInWord);
        String sortedWord = new String(charsInWord);
        return sortedWord;
		
	}
	
	int calculateScore(int word){
        	int score[] = new int[]{1,3,3,2,1,4,2,4,1,8,10,1,2,1,1,3,8,1,1,1,1,4,10,10,10,10};
        	int wordScore = 0;
        	int countOfLettersInWord[] = 
        	for(int i=0;i < countOfLettersInWord.length - 1;i++) {
            		wordScore += score[i] * countOfLettersInWord[i];
        	}
        	return wordScore;
    	}
    
    	private int[] countLetters(String word){
        	int countOfLettersInWord[] = new int[26];
        	for(int i=0;i<word.length();i++) {
        		countOfLettersInWord[Character.toLowerCase(word.charAt(i)) - 'a']++;
        	}	
		return countOfLettersInWord;	
	 }
}

public class Scrabble{
		public static void main(String[] args)
		{
			
		}
}
