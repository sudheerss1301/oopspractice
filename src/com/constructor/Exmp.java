package com.constructor;

public class Exmp {
int a= 10;
public void Exmp() {
int a=100;
System.out.println(a);
System.out.println(this.a);
}
public static void main(String[] args) {
	Exmp e = new Exmp();
	e.Exmp();
}
}
