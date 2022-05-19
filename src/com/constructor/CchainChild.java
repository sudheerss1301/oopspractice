package com.constructor;

public class CchainChild extends CchainPack{
public CchainChild() {
	System.out.println("default constructor");
}
public CchainChild(int id) {
	System.out.println("int parameterized constructor");
	System.out.println(id);
}
public static void main(String[] args) {
	CchainChild c = new CchainChild();
	CchainChild c1 =new CchainChild(119);
}
}
