package baekjoon_algorithm_advance01;

import java.util.Scanner;

public class Advance01_03_10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line= sc.nextLine();
		String lowerLine = line.toLowerCase();
		String reversedLine = "";
		boolean isPalindrome;
		
		for(int i = line.length()-1; i>=0; i--) {
			reversedLine = reversedLine+lowerLine.charAt(i);
			
		}
		if(reversedLine.equals(line)) {
			isPalindrome =true;
		}else if(line.length() == 1){
			isPalindrome = true;
		}else {
			isPalindrome = false;
		}
		
		if(isPalindrome == true) {
			System.out.println(1);
		}
		if(isPalindrome == false) {
			System.out.println(0);
		}
		
	}

}
