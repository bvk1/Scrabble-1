package day5;


import java.util.*;
import java.lang.*;
import java.io.*;

public class FilterUtility {
	public static final char STAR = '*';
	public static final char DOT = '.';

	public static void main(String[] args) {

		String regex = "b..n";
		String candidate = "born";
		regex = FilterUtility.STAR + regex + FilterUtility.STAR;
		System.out.println(matchUserRequest(regex, candidate));

	}

	public static Map<String, Integer> filterAndAddConstraintGap(
			HashMap<String, Integer> mapOfPossibleWordsWithScores, char first,
			char second, int gap) {

		Map<String, Integer> retMap = new HashMap<String, Integer>();
		Set<String> wordsSet = mapOfPossibleWordsWithScores.keySet();
		for (String word : wordsSet) {
			int i = 0;
			for (char c : word.toCharArray()) {
				if (c == first) {
					if (word.length() > i + gap + 1) {
						if (word.charAt(i + gap + 1) == second)
							retMap.put(word,
									mapOfPossibleWordsWithScores.get(word));
					}

				}

				i++;
			}

		}

		return retMap;
	}

	public static boolean matchUserRequest(String regx, String candidate) {
		if (regx.isEmpty()) {
			return false;
		} else {
			if (regx.charAt(0) == STAR) {
				if (regx.length() == 1) {
					return true;
				} else {
					return matchStar(regx.substring(1), candidate);
				}
			}

			else if (candidate.isEmpty()) {
				return false;
			} else if (regx.charAt(0) == DOT
					|| regx.charAt(0) == candidate.charAt(0)) {

				if (regx.length() == 1 && candidate.length() == 1) {
					return true;
				}

				else {
					return matchUserRequest(regx.substring(1),
							candidate.substring(1));
				}
			} else {
				return false;
			}
		}
	}

	private static boolean matchStar(String regx, String candidate) {
		for (int i = 0; i < candidate.length(); i++) {
			if (matchUserRequest(regx, candidate.substring(i))) {
				return true;
			} else {
				continue;
			}
		}

		return false;
	}
}
