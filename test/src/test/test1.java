package test;

import java.util.ArrayList;

public class test1 {
	public static void main(String[] args) {
		
	ArrayList<String>al = new ArrayList<String>();
	
	al.add("java");
	al.add("php");
	al.add("python");
	al.add("java");
	al.add("java");
	System.out.println(al);
	
	for (String string : al) {
		System.out.println(string);
	}
	System.out.println("using stream spi...");
	al.forEach(System.out::println);	
	
	
}
}