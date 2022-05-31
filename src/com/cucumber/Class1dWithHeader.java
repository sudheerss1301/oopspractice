package com.cucumber;

import java.util.LinkedHashMap;
import java.util.Map;

public class Class1dWithHeader {
public static void main(String[] args) {
	Map<String, String>emp = new LinkedHashMap<String, String>();
	emp.put("ramesh", "male");
	emp.put("ramya", "Female");
	emp.put("Suresh", "male");
	
	String gender = emp.get("ramya");
	System.out.println(gender);
	
	
	
}
}
