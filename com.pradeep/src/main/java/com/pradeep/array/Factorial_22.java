package com.pradeep.array;

import java.math.BigInteger;

public class Factorial_22 {
	
	public static  int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(fact(5));
		
	}

}
