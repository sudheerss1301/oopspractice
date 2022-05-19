package com.intque;

public class MethodOverloading {
private void m1(int a,int b,int c) {
a=10;
b=60;
c=30;
int d= a+b+c;
System.out.println(d);
}

private void m2(String d,float e,long f ) {
d="hi";
e=89898989;
f=89980;
System.out.println(d+e+f);
}

private void m3(int i,boolean b) {
	i=3;
	b=true;

}
public static void main(String[] args) {
	MethodOverloading overloading= new MethodOverloading();
	overloading.m1(10, 20, 30);
	overloading.m2(null, 0, 0);
	overloading.m3(3, false);
	
	
}
}
