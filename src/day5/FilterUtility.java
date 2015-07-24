



import java.util.*;
import java.lang.*;
import java.io.*;

public class FilterUtility
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("hello",12);
		hm.put("hellboy",13);
		hm.put("asdheat",15);
		
	 Map<String,Integer> retMap=	filterAndAddConstraintGap(hm,'h','l',2);
	 
     Set<String> wordSet =retMap.keySet();
     for( String s:wordSet){
     	System.out.println(s+" "+retMap.get(s));
     }
	}
	
	
public static Map<String,Integer> filterAndAddConstraintGap( HashMap<String,Integer> mapOfPossibleWordsWithScores, char first, char second, int gap){

     Map<String,Integer> retMap= new HashMap<String,Integer>();
     Set<String> wordsSet =mapOfPossibleWordsWithScores.keySet();
	 for(String word:wordsSet ){
	     int i=0;
	     for(char c:word.toCharArray()){
		     if(c==first){
			     if(word.length()>i+gap+1){
				    if(word.charAt(i+gap+1)==second)
					  retMap.put(word,mapOfPossibleWordsWithScores.get(word));
				  }
				
			   }
		 
		     i++;
		 }
	 
	 }


return retMap;
}
}