import java.util.*;

class AnagramListStructure{	
	String anagramList;
	int score;
}
public class ScrabbleHelper
{
	Map <String, AnagramListStructure> anagramMap;
	
	ScrabbleHelper()
	{
		Map <String, AnagramListStructure> anagramMap = new HashMap<String, AnagramListStructure>();
		File file = new File("sowpods.txt");
		if (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
    	String word;
		
		String key = calculateKey(word);
		if(anagramMap.containsKey(word)){
			
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
