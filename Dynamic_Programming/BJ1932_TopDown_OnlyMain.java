package Dynamic_Programming;

import java.util.Scanner;

public class BJ1932_TopDown_OnlyMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt(); //input
		int[][] triangle = new int[N][N]; //input
		int[][] sumArray = new int[N][N]; // for sum
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <= i; j++) {
				triangle[i][j] = s.nextInt();
				sumArray[i][j] = triangle[i][j]; //triangle is for paths
			}
		}
		
		s.close();
		//start Calculation
		
		for(int i = 1; i < N; i++) { 
			for(int j = 0; j <= i; j++) {
				if(j == 0) {sumArray[i][j] = sumArray[i][j]+sumArray[i-1][j];}
				else if(j == i) {sumArray[i][j] = sumArray[i][j]+sumArray[i-1][j-1];}
				else {
					sumArray[i][j] = 
							Math.max(sumArray[i][j]+sumArray[i-1][j-1], sumArray[i][j]+sumArray[i-1][j]);}
			}
		}
		
		System.out.println(findMax(sumArray[N-1]));
	}
	
	private static int findMax(int[] array) {
		int temp = array[0];
		int n = array.length;
		
		for(int i = 1; i < n; i++) {
			temp = Math.max(temp, array[i]);
		}
		
		return temp;
	}
}
