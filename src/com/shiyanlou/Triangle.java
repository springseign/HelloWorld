package com.shiyanlou;

public class Triangle {
	public static void main(String[] args){
		Triangle a = new Triangle();
		int lastNum;
		lastNum = a.printTriangle(5);
		System.out.println("·µ»ØÖµÎª"+lastNum);
	}

	public int printTriangle(int n) {
		int i,j;
		int z=0;
		for(i=1; i<=n; i++) {
			for(j=0; j<i; j++) {
				++z;
				System.out.printf("%02d", z);
				System.out.printf(" ");
	}
				System.out.println(" ");
		}
		return z;
	}
}