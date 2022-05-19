package com.constructor;

public class CchainPack {
		public CchainPack() {
			this(100);
			System.out.println("parent default constructor");
		}
		public CchainPack(int id) {
			System.out.println("parent int parameter constant");
			System.out.println(id);
		}
}
