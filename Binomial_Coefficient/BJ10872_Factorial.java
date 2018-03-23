package Binomial_Coefficient;

import java.util.Scanner;

public class BJ10872_Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		long N = s.nextInt();
		s.close();
		
		System.out.println(factorial(N));
	}
	
	private static long factorial(long a) {
		long temp = a;
		long result = temp;
		
		if(a == 0) {
			return 1;
		}
		else {
			
			while(temp > 1) {
				result = result*(temp-1);
				temp = temp-1;
			}
			
			return result;
			/*
			for(int i = temp-1; i >= 1; i--) {
				result = result* i ;
			}
			return result;
			*/
		}
	}
}
