package org.program;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter any value");

		int num = s.nextInt();

		if (num % 2 == 0) {
			System.out.println("Even number");

		} else {
			System.out.println("Odd number");

		}

	}
}
