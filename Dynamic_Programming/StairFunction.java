package Dynamic_Programming;

import java.util.Scanner;

public class StairFunction {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int[] arr = new int[N+1];
		
		for(int i = 1; i < N+1; i++) {
			arr[i] = s.nextInt();
		}
		
		s.close();
	}
}
