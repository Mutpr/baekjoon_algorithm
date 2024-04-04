package baekjoon_algorithm_advance01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Advance01_01_1157 {
	public static void main(String[] args) {
		int cnt = 0;
		// TODO Auto-generated method stub'
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strLower = str.toLowerCase();

		countA(strLower);

	}

	public static void countA(String str) {
		char[] strToChar = str.toCharArray();
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		for(int i=1; i<strToChar.length; i++) {
			for(int j=0; j<i; j++) {
				if(strToChar[i] == strToChar[j]) {
					strToChar[i] = '\u0000';
				}
			}
		}System.out.print(strToChar);
	}

}
