package baekjoon_algorithm_step01;

import java.util.Scanner;

public class Step01_5_10430 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		try {
			System.out.println((A+B)%C);
			System.out.println(((A%C)+(B%C))%C);
			System.out.println((A*B)%C);
			System.out.println(((A%C) * (B%C))%C);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
