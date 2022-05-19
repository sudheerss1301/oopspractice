package com.constructor;

public class StaticVar {
public static int a;
private void add() {
	a=100;
	System.out.println("a in method " +a);
}
public static void main(String[] args) {
	StaticVar s = new StaticVar();
	System.out.println("before initialization is "+a);
	s.add();
	System.out.println("after method called "+a);
	StaticVar s1 =new StaticVar();
	System.out.println("before initialization is " +s1.a);
}
}
