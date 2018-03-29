package BruteForce;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BJ2309_sevenDwarfs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] nineArr = new int[9];
//		int[] realArr = new int[9];
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			nineArr[i] = s.nextInt();
			sum = sum + nineArr[i];
		}
		s.close();
		
		int check = sum-100;
		int interimCheck = 0;
		int index1 = 0;
		int index2 = 0;
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<i; j++) {
				interimCheck = nineArr[i] + nineArr[j];
				if(interimCheck == check) {
					index1 = i;
					index2 = j;
				}
			}
		}
		for(int i = 0; i < 9; i++) {
			if(i!= index1 && i != index2) {
//				realArr[i] = nineArr[i];
				newArr.add(nineArr[i]);
//				System.out.println(realArr[i]);
			}
		}
		while(newArr.remove(null));
		
		for(int i = 0; i < newArr.size(); i++) {
			for(int j = 0; j < newArr.size()-1; j++) {
				if((int)newArr.get(j) > (int)newArr.get(j+1)) {
					Collections.swap(newArr, j, j+1);
				}
			}
		}
		for(int i = 0; i < newArr.size(); i++) {
			System.out.println(newArr.get(i));
		}
	}
}
