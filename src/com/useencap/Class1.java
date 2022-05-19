package com.useencap;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Class1 {
	private void m1(int a) {
	}

	private void m2(int a, int b) {
	}

	private void m3(List<Integer> nums) {
	}

	private void m4(LinkedHashSet<String> s) {
	}

	public static void main(String[] args) {
		Class1 c = new Class1();
		c.m1(100);
		c.m2(10, 30);
		List<Integer> i = new ArrayList<Integer>();
		i.add(10);
		i.add(20);
		i.add(30);
		c.m3(i);
		LinkedHashSet<String> l = new LinkedHashSet<>();
		l.add("Java");
		l.add("Api");
		l.add("Python");
		l.add("Selenium");
		c.m4(l);
	}
}
