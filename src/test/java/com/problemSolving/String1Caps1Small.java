package com.problemSolving;

public class String1Caps1Small {
	public static void main(String[] args) {
		String s = "gokul";

		StringBuilder s1 = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i % 2 == 0) {
				s1.append(Character.toUpperCase(c));
			} else {
				s1.append(Character.toLowerCase(c));
			}
		}
		System.out.println(s1.toString());
	}
}