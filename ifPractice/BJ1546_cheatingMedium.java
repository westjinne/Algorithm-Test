package ifPractice;

import java.util.Scanner;

public class BJ1546_cheatingMedium {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		float[] array = new float[N];
		float[] newScore = new float[N];
		for(int i = 0; i < N; i++) {
			array[i] = s.nextInt();
		}
		
		float tocheck = 0;
		for(int i = 0; i < N; i++) {
			if(array[i] > tocheck) {
				tocheck = array[i];
			}
		}
//		System.out.println(tocheck);
		for(int i = 0; i < N; i++) {
			newScore[i] = (array[i]/tocheck)*100;
//			System.out.print(newScore[i] + " ");
		}
		float res = 0;
		for(int i = 0; i < N; i++) {
			res = res + newScore[i];
		}
		res = res/N;
		System.out.println(res);
		s.close();
	}
}

//float 관련 뭐 있었던 것 같은데 집 가서 자바의 정석 float부분 확인하기 