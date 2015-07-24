package day5;

import java.util.*;
import java.io.*;

public class Scrabble {
  public static void main(String[] args)
  {
    ScrabbleHelper scrabbleHelper = new ScrabbleHelper();
    Map <String, AnagramListStructure> anagramMap = scrabbleHelper.getMap();
    while(1)
    {
      System.out.println("Enter the word");
      Scanner scanner = new Scanner(System.in);
      String word = scanner.nextLine();
      
    }
  }
}
