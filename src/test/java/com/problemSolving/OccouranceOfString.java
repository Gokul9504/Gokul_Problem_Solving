package com.problemSolving;

public class OccouranceOfString {
	public static void main(String[] args) {
		String s = "Good Afternoon";

		String s1 = s.replace(" ", "").toLowerCase();

		int[] charCount = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			char currentChar = s1.charAt(i);
			if (Character.isLetter(currentChar)) {
				int index = currentChar - 'a';
				charCount[index]++;
			}
		}

		System.out.println("Character Occurrences in the String \"" + s + "\":");
		for (char c = 'a'; c <= 'z'; c++) {
			int index = c - 'a';
			if (charCount[index] > 0) {
				System.out.println(c + ": " + charCount[index]);
			}
		}
	}
}