package baekjoon_algorithm_advance01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Date date = new Date();
		date.setTime(1101010);;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		String time = formatter.format(date);
		//데이트 포맷을 date 라는 변수에 걸어주는것
		System.out.println(date);
		System.out.println(formatter.format(date));
	}

}
