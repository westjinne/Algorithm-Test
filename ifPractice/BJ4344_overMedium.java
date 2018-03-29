package ifPractice;
//더 해야함 
import java.util.Scanner;
import java.util.ArrayList;

public class BJ4344_overMedium {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt(); //test case의 갯수 받음 
		int num = 0;
		
		ArrayList<Integer> mArrayList = new ArrayList<Integer>();
		float[] resultArr = new float[testCase];
		
		for(int i = 0; i < testCase; i++) {
			num = s.nextInt(); // 각 arr의 길이 설정 
			
			for(int j = 0; j < num; j++) {
				mArrayList.add(s.nextInt()); //array에 값 입력 
			}
		
			resultArr[i] = calcPer(num, mArrayList);
		}
		
		for(int i = 0; i < testCase; i++) {
			System.out.print(resultArr[i] + " ");
		}
		s.close();
	}
	private static float calcPer(int a, ArrayList<Integer> arr) {
		float result = 0;
		int temp = 0;
		
		for(int i = 0; i < a; i++) {
			temp = temp + (int)arr.get(i);
		}
		result = (temp/a);
		return result;		
	}
}
