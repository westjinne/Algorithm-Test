package Dynamic_Programming;

//Forward Approach_Path 포함 
import java.util.Scanner;

public class NumberTriangle1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); //N받음 
		int[][] arr = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <= i; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		int[][] sum = new int[N][N];
		sum[0][0] = arr[0][0];
		
		
		for(int i = 1; i < N; i++) { //경우 나눈 뒤, 자기 자신의 자리 + 이전 경로 예측해서 그 중 큰 놈으로 
			for(int j = 0; j <= i; j++) {
				if(j == 0) {
					sum[i][j] = arr[i][j] + sum[i-1][0];					
				} else if(j == i) {
					sum[i][j] = arr[i][j] + sum[i-1][j-1];
				} else {
					//sum[i][j] = Math.max(arr[i][j] + sum[i-1][j-1], arr[i][j] + sum[i-1][j]); //
					if(arr[i][j] + sum[i-1][j-1] > arr[i][j] + sum[i-1][j]) {
						sum[i][j] = arr[i][j] + sum[i-1][j-1];
						
					} else {
						sum[i][j] = arr[i][j] + sum[i-1][j];
					}
				}
			}
		}
		
/*		for(int i = 0; i < N; i++) { //sum 행렬 잘 만들어졌는지 확인용 print문 
			for(int j = 0; j <= i; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
*/
		int max = findMax(sum[N-1]); //마지막 줄 행
		System.out.println(max);
		/*
		for(int i = 0; i < N; i++) {
			if(max == sum[N-1][i]) {
				a[N-1] = N-1;
				b[N-1] = i;
			}
		}
		*/
		for(int i = 0; i < N; i++) {
			//System.out.print(arr[a[i]][b[i]] + " ");
		}
	}
	
	private static int findMax(int[] array) { //아예 행렬을 넣어버려서 이 안에서 MAX 구하도록 
		int temp = array[0];
		int n = array.length;
		
		for(int i = 1; i < n; i++) {
			temp = Math.max(temp, array[i]);
		}
		
		return temp;
	}
}
