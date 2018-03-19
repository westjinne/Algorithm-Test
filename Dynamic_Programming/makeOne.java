package Dynamic_Programming;

import java.util.Scanner;

public class makeOne {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		
		int n = s.nextInt();
		System.out.print(n + "=>");
		while(n != 1) {
			if(n%3 == 0) {
				n = n/3;
				System.out.print(n + "=>");
			}
			else if(n%2 == 0) {
				n = n/2;
				System.out.print(n + "=>");
			}
			else {
				n = n-1;
				System.out.print(n + "=>");
			}
			count++;
		}
		System.out.println(n);
		System.out.println(count);
		s.close();
	}
}
