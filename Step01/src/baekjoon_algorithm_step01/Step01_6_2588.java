package baekjoon_algorithm_step01;

import java.util.Scanner;

public class Step01_6_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int [] BArray = new int[3];
		
		BArray[0] = ((B%100)%10)*A;
		BArray[1] = (((B/10)%10)*A);
		BArray[2] = (B/100*A);
		
		for(int i=0; i<BArray.length; i++) {
			System.out.println(BArray[i]);
		}
		System.out.println(A*B);
	}

}
