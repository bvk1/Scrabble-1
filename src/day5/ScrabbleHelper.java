package day5;

import java.util.*;
import java.io.*;

class ScrabbleHelper
{
	public Map <String, AnagramListStructure> anagramMap;
	
	ScrabbleHelper() throws IOException
	{
		anagramMap = new HashMap<String, AnagramListStructure>();
		File file = new File("C:\\sowpods.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String word = br.readLine();
		while(word != null) {
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
			word = br.readLine();
		}
		br.close();
	}
	
	public String calculateKey(String word)
	{
        char[] charsInWord = word.toCharArray();
        Arrays.sort(charsInWord);
        String sortedWord = new String(charsInWord);
        return sortedWord;		
	}
	
	
	
	public static int calculateScore(String word){
		//TODO: Dinesh
//    	int score[] = new int[]{1,3,3,2,1,4,2,4,1,8,10,1,2,1,1,3,8,1,1,1,1,4,10,10,10,10};
//    	int wordScore = 0;
//    	int countOfLettersInWord[] = 
//    	for(int i=0;i < countOfLettersInWord.length - 1;i++) {
//        		wordScore += score[i] * countOfLettersInWord[i];
//    	}
    	return 1;
	}

	private int[] countLetters(String word){
		//TODO: do we need this? 
    	int countOfLettersInWord[] = new int[26];
    	for(int i=0;i<word.length();i++) {
    		countOfLettersInWord[Character.toLowerCase(word.charAt(i)) - 'a']++;
    	}	
	return countOfLettersInWord;	
 }
}
