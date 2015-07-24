import java.util.*;

class AnagramListStructure{	
	String anagramList;
	int score[];
}
public class ScrabbleHelper
{
	Map <String, AnagramListStructure> anagramMap;
	
	ScrabbleHelper()
	{
		Map <String, AnagramListStructure> anagramMap = new HashMap<String, AnagramListStructure>();
		score = new int[]{1,3,3,2,1,4,2,4,1,8,10,1,2,1,1,3,8,1,1,1,1,4,10,10,10,10};
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
