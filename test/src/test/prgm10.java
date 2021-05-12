package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class prgm10 {
	public static void main(String[] args) {
		try {
			String readInput = readInputFunction();
			String[] sequence = readInput.split(",");
			Set<Integer> sequenceList = getNumberList(sequence);
			System.out.println(sequenceList);
		} catch (IOException e) {
			System.out.println("The sequence of numbers entered is invalid");
		} catch (NumberFormatException nfe) {
			System.out.println("The sequence of numbers entered is invalid");
		}

	}

	public static String readInputFunction() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sequence");
		String readInput = br.readLine();
		return readInput;
	}

	public static Set<Integer> getNumberList(String[] sequence) {
		Set<Integer> sequenceList = new TreeSet<Integer>();
		for (String loop : sequence) {
			if (loop.contains("-")) {
				String splitedString[] = loop.split("-");
				List<Integer> list = new ArrayList<Integer>();
				Integer first = Integer.valueOf(splitedString[0]);
				Integer second = Integer.valueOf(splitedString[1]);
				while (first < second) {
					list.add(first);
					first++;
				}
				list.add(second);
				for (int j = 0; j < list.size(); j++) {
					if (!(sequenceList.contains(list.get(j)))) {
						sequenceList.add(list.get(j));
					}
				}
			} else {
				if (!(sequenceList.contains(Integer.valueOf(loop)))) {
					sequenceList.add(Integer.valueOf(loop));
				}

			}
		}
		return sequenceList;
	}

}
