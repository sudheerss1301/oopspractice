package com.constructor;
//Java Program to illustrate constructor overloading
//using same task (addition operation ) for different
//types of arguments.
class Gee {
	// constructor with one argument
	Gee(String name) {
		System.out.println("Constructor with one " + "argument - String : " + name);
	}
	// constructor with two arguments
	Gee(String name, int age) {

		System.out.println("Constructor with two arguments : " + " String and Integer : " + name + " " + age);
	}

	// Constructor with one argument but with different
	// type than previous..
	Gee(long id) {
		System.out.println("Constructor with one argument : " + "Long : " + id);
	}
}
class GF {
	public static void main(String[] args) {
		// Creating the objects of the class named 'Geek'
		// by passing different arguments

		// Invoke the constructor with one argument of
		// type 'String'.
		Gee geek2 = new Gee("Shikhar");

		// Invoke the constructor with two arguments
		Gee geek3 = new Gee("Dharmesh", 26);

		// Invoke the constructor with one argument of
		// type 'Long'.
		Gee geek4 = new Gee(325614567);
	}
}