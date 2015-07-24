package day5;

import java.util.*;
import java.io.*;

public class Scrabble {
  public static void main(String[] args) throws IOException
  {
    ScrabbleHelper scrabbleHelper = new ScrabbleHelper();
    System.out.println(scrabbleHelper.anagramMap.size());
  }
}
