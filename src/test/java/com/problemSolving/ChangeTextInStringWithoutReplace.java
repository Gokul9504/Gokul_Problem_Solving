package com.problemSolving;

public class ChangeTextInStringWithoutReplace {
	public static void main(String[] args) {
		
		String s = "MAS to NDLS";
		String cs = convertString(s);
		System.out.println("Converted String: " + cs);
	}

	public static String convertString(String x) {
		String[] w = x.split(" ");
		StringBuilder converted = new StringBuilder();
		for (String c : w) {
			if (c.equals("MAS"))
				converted.append("BAN").append(" ");
			else if (c.equals("NDLS"))
				converted.append("KL").append(" ");
			else
				converted.append(c).append(" ");
		}
		return converted.toString().trim();
	}
}