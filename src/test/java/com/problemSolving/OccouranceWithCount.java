package com.problemSolving;

import java.util.HashMap;
import java.util.Map;

public class OccouranceWithCount {

	public static void main(String[] args) {
		String input = "welcome Home";
		String output = "";

		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char c : input.toLowerCase().toCharArray()) {
			if (c != ' ') {
				charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
			}
			System.out.println(charCountMap);
		}
		System.out.println();
		StringBuilder result = new StringBuilder();

		for (char c : input.toCharArray()) {
			if (c != ' ' && charCountMap.containsKey(c)) {
				result.append(c).append("-" + charCountMap.get(c));
				charCountMap.remove(c);
			}
			System.out.println("occourance of each Char :\t" + result + "\n");
		}

		System.out.println("Original string: " + input);
		System.out.println("Modified string: " + result);

		for (int i = 0; i < input.length(); i++) {
			char d = input.toLowerCase().charAt(i);
			if (output.indexOf(d) == -1) {
				output = output + d;
			}
		}
		System.out.println();
		System.out.println("String after removed Duplicates:\t" + output);
	}
}