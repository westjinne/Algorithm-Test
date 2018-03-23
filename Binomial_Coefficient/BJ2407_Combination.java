package Binomial_Coefficient;

import java.util.Scanner;
import java.math.BigInteger;

public class BJ2407_Combination {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		s.close();
		/*
		long result = 0L;
		long top = n;
		long bottom = m;
		for(int i = 1; i < bottom; i++) {
			top = top*(n-i);
		}
		for(int i = m-1; i > 0; i--) {
			bottom = bottom*i;
		}
		
		System.out.println("top: " + top);
		System.out.println("bottom: " + bottom);
		*/
		System.out.println(calculCom(n,m));
	}
	
	private static BigInteger calculCom(int a, int b) {
		BigInteger result = BigInteger.valueOf(0);
		BigInteger top = BigInteger.valueOf(a);
		BigInteger bottom = BigInteger.valueOf(b);
		int res = 0;
		
		for(int i = 1; i < b; i++) {
			res = a-i;
			top = top.multiply(BigInteger.valueOf(res));
//			top = top * (a-i);
		}
		for(int i = b-1; i > 0; i--) {
			bottom = bottom.multiply(BigInteger.valueOf(i));
//			bottom = bottom * i;			
		}
		result = top.divide(bottom);
//		result = (top/bottom);
		return result;
	}
}
