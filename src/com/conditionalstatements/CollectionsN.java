package com.conditionalstatements;
import java.util.HashSet;
import java.util.Set;
public class CollectionsN {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3,0 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("  ");
		}
	}
}

class Coll{
	public static void main(String[] args) {
		Set<Integer> a =new HashSet<Integer>();
		a.add(20);
		System.out.println(a);
	}
}

class Colle{
	public static void main(String[] args) {
		Set<Integer> a =new HashSet<Integer>();
		a.add(10);
		System.out.println(a);
	}
}

