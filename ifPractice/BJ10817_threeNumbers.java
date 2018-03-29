package ifPractice;

import java.util.Scanner;
//머리 더 쓰기.. 
public class BJ10817_threeNumbers {
	public static void main(String[] args) {
		//두 번째 큰 정수라는 것이 포인트. >가 아니라 >= 사용해보기 (30 30 10) 
		Scanner s = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int i = 0; i < 3; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(checkSecond(arr));
		s.close();
		
	}
	private static int checkSecond(int[] array) {
		int temp1 = 0;
		for(int i = 0; i < 3; i++) {
			if(array[i] >= temp1) {
				temp1 = array[i];
			}
		}
		int temp2 = temp1;
		for(int i = 0; i < 3; i++) {
			if(temp2 >= array[i]) {
				temp2 = array[i];
			}
		}
		int result = 0;
		for(int i = 0; i < 3; i++) {
			if(array[i] != temp1 && array[i] != temp2) {
				result = array[i];
			}
		}
		return result;
	}
}
