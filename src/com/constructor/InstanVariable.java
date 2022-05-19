package com.constructor;

public class InstanVariable {
public int a; //before initializtion
public void add() {
	a=100;  //after initialization
	System.out.println("a in method "+a);
}
public static void main(String[] args) {
	System.out.println("main");
	InstanVariable i= new InstanVariable();
	System.out.println("before initialization"+i.a);
		i.add();
	System.out.println("after initialization"+i.a);
	InstanVariable i1=new InstanVariable();
	System.out.println("before initialization i1 "+i1.a);
}
}
