package Dynamic_Programming;

import java.util.Scanner;

public class Fibonacci_temp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("N:");
		int N = s.nextInt(); //Test case N 
		
		int[] array = new int[N];
		for(int i = 0; i <  N; i++) {
			array[i] = s.nextInt();
		}
		
/*		for(int i = 0; i <  N; i++) {
			System.out.print(array[i] + " ");
		} //array 생성 확인 위한 for문 
*/		
		int[][] num = new int[N][2]; // <#0, #1>을 표현하기 위한 array 
		
		for(int i = 0; i < N; i++) {
			int[][] temp = new int[array[i]+1][2];
			if(array[i] == 0) {
				num[0][0] = 1; num[0][1] = 0;
			} else if(array[i] == 1) {
				num[0][0] = 1; num[0][1] = 0;
				num[1][0] = 0; num[1][1] = 1; // fibonacci의 예외 case 미리 선언
			}
			else {
				for(int j = 2; j <= array[i]; j++) { //각 array의 값에 설정해서 <#0, #1> count
					temp[0][0] = 1; temp[0][1] = 0;
					temp[1][0] = 0; temp[1][1] = 1;
					temp[j][0] = temp[j-1][0] + temp[j-2][0];
					temp[j][1] = temp[j-1][1] + temp[j-2][1];
				}
				num[i][0] = temp[array[i]][0]; num[i][1] = temp[array[i]][1];
			}
			System.out.println(num[i][0] + " " + num[i][1]);
		}
	}
}
