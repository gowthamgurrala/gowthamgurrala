package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class prgm05 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		Employee e1 = new Employee(1, "emp1");
		Employee e2 = new Employee(2, "emp2");
		Employee e3 = new Employee(3, "emp3");
		Employee e4 = new Employee(4, "emp4");
		hm.put(e1.getId(), e1.getName());
		hm.put(e2.getId(), e2.getName());
		hm.put(e3.getId(), e3.getName());
		hm.put(e4.getId(), e4.getName());

		Set<Map.Entry<Integer, String>> entries = hm.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey());
		}
	}

}
