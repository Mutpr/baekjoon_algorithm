package baekjoon_algorithm_step1;

import java.util.Scanner;

public class step1_4_10926 {

	public static void main(String[] args) {
        String existedId = "joonas";
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		if(id.length()>=50) {
			System.exit(0);
		}else if(id.length()<50 && existedId.equals(id)) {
			System.out.println(id.toLowerCase()+"??!");
		}
	}

}
