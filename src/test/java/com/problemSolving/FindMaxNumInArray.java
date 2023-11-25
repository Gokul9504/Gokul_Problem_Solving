package com.problemSolving;

public class FindMaxNumInArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 123;
		a[1] = 124;
		a[2] = 125;
		a[3] = 126;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println(a[0]);
	}
}