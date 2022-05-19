package com.selpractice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Class2 {
	private int add(int a, int b) {
		int c = a + b;
		return c;
	}
	private List<Integer> m1() {
		List<Integer> i = new ArrayList<>();
		i.add(12);
		i.add(13);
		i.add(14);
		i.add(15);
		return i;
	}
	private LinkedHashMap<Integer, String> m2() {
		LinkedHashMap<Integer, String> m = new LinkedHashMap<>();
		m.put(10, "Java");
		m.put(20, "sql");
		m.put(30, "oracle");
		m.put(40, "python");
		m.put(50, "API");
		return m;
	}
	public static void main(String[] args) {
		Class2 c2 = new Class2();
		int res = c2.add(10, 20);
		System.out.println(res);
		List<Integer> m1 = c2.m1();
		System.out.println(m1);
		LinkedHashMap<Integer, String> m = c2.m2();
		System.out.println(m);
	}
}
