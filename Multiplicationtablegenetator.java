package day5;

import java.util.Scanner;

public class Multiplicationtablegenetator {

	public static void main(String[] args) {

		System.out.println("Enter the number to print the multiplication table");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		System.out.println("Multiplication table for" + number + ":");
		for (int i = 1; i <= 10; i++) {
			int result = number * i;
			// System.out.println(result);
			System.out.println(number + "x" + i + "=" + result);
		}

	}

}
