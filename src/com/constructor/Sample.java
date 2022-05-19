package com.constructor;

public class Sample extends CchainPack {
	public Sample() {
		super(700);
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		Sample s = new Sample();

	}
}