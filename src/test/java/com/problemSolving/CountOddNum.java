package com.problemSolving;

public class CountOddNum {
	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 0; i <= 50; i++) {
			if (i%2!=0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total No of Odd are : "+count);
	}
}