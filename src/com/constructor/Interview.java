package com.constructor;

public class Interview {
public static int a= 5;
public int b=5;
public Interview() {
	System.out.println("a is"+a);
	System.out.println("b is"+b);
	a++;
	b++;
}
public static void main(String[] args) {
	Interview i1= new Interview();
	Interview i2= new Interview();
	Interview i3= new Interview();
}
}
