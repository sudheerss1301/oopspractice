package com.intque;

public class SubClass extends SingleInheritance {

	@Override
	public void m1() {
		System.out.println("super");
		super.m1();
	}
	@Override
	public void m2() {
		System.out.println("hi");
		super.m2();
	}
	
	public static void main(String[] args) {
		SubClass class1 = new SubClass();
		class1.m1();
		class1.m2();
	}
}
