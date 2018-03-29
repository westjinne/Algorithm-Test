package Realization;

import java.util.Scanner;

public class BJ10871 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Check c = new Check();
		
		for(int i = 0; i < 2; i++) {
			c.array[i] = s.nextInt();
		}
		
		for(int i = 0; i < c.array[0]; i++) {
			c.newArray[i] = s.nextInt();
		}
		
		s.close();
		c.toCheck();
	}
}
class Check{
	public int[] array = new int[2];
	public int[] newArray = new int[array[0]];
	
	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int[] getNewArray() {
		return newArray;
	}

	public void setNewArray(int[] newArray) {
		this.newArray = newArray;
	}

	public void toCheck(){
		for(int i = 0; i < array[0]; i++) {
			if(newArray[i] < array[1]) {
				System.out.print(newArray[i] + " ");
			}
		}
	}
}
//long 추가, 시간복잡도 생각. 함수화하기. 
//get, set 공부 다시 하기 (자바의 정석 참고하고 풀기)