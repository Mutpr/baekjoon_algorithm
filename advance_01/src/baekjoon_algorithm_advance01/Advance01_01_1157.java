package baekjoon_algorithm_advance01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Advance01_01_1157 {
	public static void main(String[] args) {
		int cnt = 0;
		// TODO Auto-generated method stub'
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strLower = str.toLowerCase();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c:strLower.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
	}
}
