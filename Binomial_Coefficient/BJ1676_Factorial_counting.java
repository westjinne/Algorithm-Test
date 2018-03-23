package Binomial_Coefficient;

import java.util.Scanner;

public class BJ1676_Factorial_counting {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		s.close();
		
		System.out.println(factorialCount(N));
	}
	
	private static int factorialCount(int a) {
		int temp = a;
		int count = 0;
		
		if(a == 0) {
			return 0;
		}
		else {
			for(int i = temp; i > 0; i--) {
				if(i%5 == 0) {
					count++;
					if(i%25 == 0) {
						count++;
						if(i%125 == 0) {
							count++;
							if(i%625 == 0) {
								count++;
							}
						}
					}
				}
			}
			return count;
		}
	}
}
