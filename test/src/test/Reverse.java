package test;

import java.util.Scanner;

public class Reverse {

	static void reverse(int number) {
		int reverse = 0;
		while (number != 0) {

			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;

		}
		System.out.println(reverse);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		reverse(num);

	}

}
