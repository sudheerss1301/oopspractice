package com.constructor;

public class BlockStatic {
	static {
		System.out.println("static block will run before main");
	}
	public static void main(String[] args) {
		System.out.println("see what happened");
	}
}
