package baekjoon_algorithm_advance01;

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
		int cnt = 0;
		char[] strToChar = str.toCharArray();
		char[] sameChar = new char[str.length()];
		for (int i = 1; i < strToChar.length; i++) {
			if (strToChar[i] == strToChar[i - 1]) {
				sameChar[i-1] = strToChar[i-1];
			}
		}
		for(int i=0; i<sameChar.length; i++) {
			if(sameChar[i] != '\0') {
				cnt++;
			}
		}
		if(cnt == 1) {
			for(int i=0; i<sameChar.length; i++) {
				System.out.println(Character.toUpperCase(sameChar[i]));
			}
		}else if(cnt != 1){
			System.out.println("?");
		}
	}

}
