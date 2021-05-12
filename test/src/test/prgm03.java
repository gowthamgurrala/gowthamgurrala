package test;

import java.util.ArrayList;

public class prgm03 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("java");
		al.add("python");
		al.add("c");
		Object []o = al.toArray();
		for (Object object : o) {
			System.out.println(object);
		}
	}
}
