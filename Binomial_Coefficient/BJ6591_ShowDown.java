package Binomial_Coefficient;

import java.util.Scanner;

public class BJ6591_ShowDown {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] array = new int[2][];
		
		int i = 0;
		while(s.hasNextInt()) {
			array[0][i] = s.nextInt();
			array[1][i] = s.nextInt();
			if(array[0][i] == 0 && array[0][i] == 0) {
				break;
			}
			i++;
		}
		for(int j = 0; j < array[0].length; j++) {
			System.out.println(array[0][j] + " " + array[0][j]);
		}
	}
}
