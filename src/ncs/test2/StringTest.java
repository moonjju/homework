package ncs.test2;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		
		String str = "1.22,4.12,5.93,8.71,9.34";
		
		double data[]= new double[5];
		double sum = 0;
		int cout = 0;// 갯수ㅁ 구할때 꼭 있어야 혀
		
		String[] st = str.split(",");
		
		for(String s : st) {
		
			data[cout] = Double.parseDouble(s);//String 형변환
			//data에 출력한 s 갑을 넣는게 어려웠다.ㅜ//설명 요청
				sum += data[cout];
				cout++;
			
		}
		System.out.printf("합계 : %.3f%n 평균 : %.3f%n",sum ,sum/cout);
		
	}
}
