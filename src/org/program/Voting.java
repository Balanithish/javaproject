package org.program;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = s.nextInt();

		if (age <= 18) {
			System.out.println("Not Eligible");

		} else {
			System.out.println("Eligble");

		}

	}

}
