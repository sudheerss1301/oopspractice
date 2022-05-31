package com.cucumber;

import java.util.ArrayList;
import java.util.List;

public class Class2DwithoutHeader {
public static void main(String[] args) {
	

	List<ArrayList<String>>emp = new ArrayList<ArrayList<String>>();
	
	ArrayList<String>a1 = new ArrayList<String>();
	a1.add("Ram");
	a1.add("ram@gmail.com");
	a1.add("Java");
	ArrayList<String>a2 = new ArrayList<String>();
	a2.add("Sam");
	a2.add("sam@gmail.com");
	a2.add("Python");
	ArrayList<String>a3 = new ArrayList<String>();
	a3.add("lam");
	a3.add("lam@gmail.com");
	a3.add("Sql");
	
	
	emp.add(a1);emp.add(a2);emp.add(a3);
	
	ArrayList<String> list = emp.get(0);
	String ramCourse = list.get(2);	
	System.out.println(ramCourse);
	
}
}