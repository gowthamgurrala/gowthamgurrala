package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class prgm11 {
public static void main(String[] args) {
	Map<String, String> map = new LinkedHashMap<String, String>();

	map.put("id", "1");
	map.put("name", "rohan");
	map.put("age", "26");

	for (Map.Entry<String, String> entry : map.entrySet()) {
	    System.out.println(entry.getKey() + " = " + entry.getValue());
	}
}
}
