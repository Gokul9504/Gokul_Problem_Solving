package com.problemSolving;

public class StringWordReverse {
	public static void main(String[] args) {

		String s = "dooG noonretfA";
		String rev = "";

		String[] split = s.split(" ");
		for (String r1 : split) {
			String temp = "";
			for (int i = r1.length() - 1; i >= 0; i--) {
				char c = r1.charAt(i);
				temp = temp + c;
			}
			rev = rev + temp + " ";
		}
		System.out.println(rev);
	}
}