package baekjoon_algorithm_step01;

import java.util.Scanner;

public class Step01_07_11382 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		if(1<=A&&A<=Math.pow(10, 12) || 1<=B&&B<=Math.pow(10, 12) || 1<=C&&C<=Math.pow(10, 12)) {
			long answer = A+B+C;
			System.out.print(answer);
		}
		
		
	}

}
