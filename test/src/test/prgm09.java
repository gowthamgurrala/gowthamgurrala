package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class prgm09 {
	public static void main(String[] args) {
		// Unsorted list
		Integer[] numbers = new Integer[] { 15, 11, 9, 55, 47, 18, 1123, 520, 366, 420 };
		List<Integer> numbersList = Arrays.asList(numbers);

		Collections.sort(numbersList);

		System.out.println(numbersList);
	}
}
