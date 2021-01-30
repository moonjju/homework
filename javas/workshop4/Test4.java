package workshop4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		 Calc c = new Calc();
		Scanner sc = new Scanner(System.in);
		System.out.println("5 ~ 10 사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();	
		
		System.out.println("결과 : " + c.calculate(num));
		}
	}


