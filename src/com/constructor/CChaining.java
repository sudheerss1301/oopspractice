package com.constructor;
public class CChaining {
	public CChaining() {
		this(100);
		System.out.println("default constructor");
	}
	public CChaining(int id) {
		this("sudheer", 6300535713l);
		System.out.println("int parameterized constructor");
		System.out.println(id);
	}
	public CChaining(String name, long phone) {
		System.out.println("string long parameterized constructor");
		System.out.println(name);
		System.out.println(phone);
	}
	public static void main(String[] args) {
		CChaining c = new CChaining();
	}
}
