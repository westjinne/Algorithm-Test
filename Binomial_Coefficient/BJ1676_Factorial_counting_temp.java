package Binomial_Coefficient;

import java.util.Scanner;

public class BJ1676_Factorial_counting_temp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		s.close();
		
//		int toCheck = factorialCount(N);
//		System.out.println(toCheck);
//		System.out.println(checkZero(toCheck));
		System.out.println(factorialCount(N));
	}
	
	private static int factorialCount(int a) {
		int temp = a;
		//int result = temp;
		int count = 0;
		
		if(a == 0) {
			return 0;
		}
		else {
			/*
			while(temp > 1) {
				result = result*(temp-1);
				temp = temp-1;
			}
			*/
			for(int i = temp; i > 1; i--) { //5로 나누는거 temp자신도 check하기 위해 
				//result = result*(i-1) ;
				
				if(i%5 == 0) count++;
			}
			return count;
		}
	}
	/*
	private static int checkZero(int b) {
		int num = b;
		int count = 0;
		
		while (num%10 == 0){
				count++;
				num = num/10;
		}
		return count;
	}
	*/
}
