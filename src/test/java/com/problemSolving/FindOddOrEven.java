package com.problemSolving;

import java.util.Scanner;

public class FindOddOrEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i%2==0) {
			System.out.println(i+" is a even Number");
		}
		else {
			System.out.println(i+" is a odd Number");

		}
	}
}