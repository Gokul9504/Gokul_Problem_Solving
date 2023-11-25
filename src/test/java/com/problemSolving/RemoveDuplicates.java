package com.problemSolving;

public class RemoveDuplicates {
	public static void main(String[] args) {

		String a = "good";
		String x = "";

		for (int i = 0; i < a.length(); i++) {
			char d = a.charAt(i);
			if (x.indexOf(d) == -1) {
				x = x + d;
			}
		}
		System.out.println(x);
	}
}