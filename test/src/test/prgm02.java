package test;

import java.util.ArrayList;

public class prgm02 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add("php");

		System.out.println("elements of the list "+list);
		String[] myArray = new String[list.size()];
		list.toArray(myArray);

		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Element at the index " + i + " is ::" + myArray[i]);
		}
	}
}
