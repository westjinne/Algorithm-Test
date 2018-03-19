package Dynamic_Programming;

import java.util.Scanner;

public class RGB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int[][] arr = new int[N][3];
		int[][] sum = new int[N][3]; //arr랑 크기 같고, 합만 저장하는 배열 생성 
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <3; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		for(int j = 0; j < 3; j++) {
			sum[0][j] = arr[0][j]; //더할게 없으니 첫줄은 arr이랑 같음 
		}
		
		for(int i = 1; i < N; i++) { //arr 자기 자신 + 이전 줄의 애 path 예상해서 sum으로 표현 
			for(int j = 0; j < 3; j++) {
				if(j == 0) {
					sum[i][j] = Math.min(arr[i][j]+sum[i-1][j+1], arr[i][j]+sum[i-1][j+2]);
				}
				else if(j == 1) {
					sum[i][j] = Math.min(arr[i][j]+sum[i-1][j+1], arr[i][j]+sum[i-1][j-1]);
				}
				else {
					sum[i][j] = Math.min(arr[i][j]+sum[i-1][j-1], arr[i][j]+sum[i-1][j-2]);
				}
			}
		}
		int temp = findMin(sum[N-1][0], sum[N-1][1], sum[N-1][2]);
		
		System.out.println(temp);
		
/*		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
*/
/*  		for(int i = 0; i < N; i++) { //arr을 확인하기 위한 print문 
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
*/
		s.close();
	}
	private static int findMin(int a, int b, int c) { //3개의 수 중 작은거 찾아내는 함수 생
		int temp = 0;
		temp = Math.min(a, b);
		temp = Math.min(temp, c);
		return temp;
	}
}
