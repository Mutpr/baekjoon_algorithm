package baekjoon_algorithm_advance01;

import java.util.Scanner;

public class Advance01_05_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int count = 0;
		char prev = ' ';

		for (int i = 0; i < length; i++) {
			String line = sc.nextLine().toLowerCase();
			for(int j = 0; j<i; i++) { // j의 범위를 수정합니다.
				char character = line.charAt(j);
				prev = character;
				if(prev == character) {
					count++;
				}
			}

		}System.out.println(count);
		

	}
}
