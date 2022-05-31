package com.cucumber;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Class2DWithHeader {
	public static void main(String[] args) {

		List<LinkedHashMap<String, String>> emp = new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> m1 = new LinkedHashMap<String, String>();
		m1.put("name", "Ram");
		m1.put("email", "ram@gmail.com");
		m1.put("course", "Java");

		LinkedHashMap<String, String> m2 = new LinkedHashMap<String, String>();
		m2.put("name", "Ramesh");
		m2.put("email", "ramesh@gmail.com");
		m2.put("course", "SQL");

		LinkedHashMap<String, String> m3 = new LinkedHashMap<String, String>();
		m3.put("name", "RamSagar");
		m3.put("email", "ramsagar@gmail.com");
		m3.put("course", "Python");

		emp.add(m1);
		emp.add(m2);
		emp.add(m3);

		LinkedHashMap<String, String> details = emp.get(0);

		String ramemail = details.get("email");
		System.out.println(ramemail);

	}
}
