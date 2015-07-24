package day5;

import java.util.*;
import java.io.*;

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
	
		
	
}
