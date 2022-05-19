package com.constructor;

public class Example {
public Example() {
	System.out.println("default constructor");
	}
public Example(int id) {
	System.out.println("parameterized consructor");
	System.out.println(id);
	}	
public void Example() {
	System.out.println("method");
}
	public static void main(String[] args) {
		Example e =new Example();
		Example e1 = new Example(100);
		e.Example();
	}
	
	
	
	
	
	
	
	
	
	
	
}
