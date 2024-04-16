package baekjoon_algorithm_advance01;

import java.util.Scanner;

public class Advance01_04_3003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] checkerCheck = new int[6];
		int [] checkLine = new int[6];
		int [] checker = {1, 1, 2, 2, 2, 8};
		
		for(int i=0; i<checkerCheck.length; i++) {
			int check = sc.nextInt();
			checkerCheck[i]=check;
				checkLine[i] = checker[i]-checkerCheck[i];
				System.out.println(checkLine[i]);
			
		}
		
	}

}
