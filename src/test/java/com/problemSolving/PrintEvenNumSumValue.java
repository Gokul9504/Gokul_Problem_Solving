package com.problemSolving;

public class PrintEvenNumSumValue {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("The sum value is:" + sum);
	}
}