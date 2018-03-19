package Dynamic_Programming;

import java.util.Scanner;

public class Fibonacci {
	private static int count0 = 0;
	private static int count1 = 0;
	//private static Scanner s;//이 방법도 되기는 해!
	public static int fibonacci(int n) {  
		if (n==0) {
			//System.out.println("0");
			count0++;
			return 0;
		} else if (n==1){
			//System.out.println("1");
			count1++;
			return 1;
		} 
		else {
			return fibonacci (n-1) + fibonacci (n-2);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("N:");
		int N = s.nextInt(); //Test case N 
		//if fi~=0, count0++, fi=1, count1++
		
		int[] array = new int[N];
		for(int i = 0; i <  N; i++) {
			array[i] = s.nextInt();
		}
		
		int[] num = new int[2];
		
		for(int i = 0; i < N; i++) {
			fibonacci(array[i]);
			num[0] = count0;
			num[1] = count1;
			System.out.println(num[0] + " " + num[1]);
			count0 = 0; //초기화 
			count1 = 0; //초기화 
		}
	
		s.close();
	}
}
