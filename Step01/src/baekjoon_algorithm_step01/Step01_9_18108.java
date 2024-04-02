package baekjoon_algorithm_step01;

import java.util.Scanner;

public class Step01_9_18108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int buddhaYear = sc.nextInt();
		if(buddhaYear >= 1000 && buddhaYear <=3000) {
			int christYear = buddhaYear-543;
			System.out.println(christYear);
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	}

}
