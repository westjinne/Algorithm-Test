package ifPractice;

import java.util.Scanner;

public class BJ1110_SumCycle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.print("input N: "); //이것 있었어서 틀렸음 
		int input = s.nextInt();
		s.close();
		System.out.println(checkCycle(input));
	}
	private static int checkCycle(int a) {
		int temp = a;
		int newRes = 0;
		int count = 0;
		
		do {
			if(temp < 10) {
				temp = temp * 11;
				count++;
			}
			else {
				newRes = (temp/10) + (temp%10);
				temp = 10*(temp%10) + (newRes%10);
				count++;
			}
		}
		while(temp != a);
		
		return count;
	}
}
