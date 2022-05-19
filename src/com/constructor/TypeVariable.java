package com.constructor;

public class TypeVariable {
public void add() {
	int a=10;
	System.out.println("a in method"+a);
}
//local variable
public static void main(String[] args) {
	System.out.println("main");
	int a=100;
	System.out.println("a in main"+a);
	TypeVariable t = new TypeVariable();
	t.add();
}
}
