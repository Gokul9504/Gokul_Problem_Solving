package com.problemSolving;

import java.util.Scanner;

public class ReverseTheNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int rev = 0;
		while (i != 0) {
			rev = rev * 10;
			rev= rev+i%10;
			i /= 10;
		}
		System.out.println(rev);
	}
}