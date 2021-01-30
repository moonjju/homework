package workshop4;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 5 사이의 정수를 하나 입력하세요 : ");
		int num = sc.nextInt();	
		
		int sum = 0;
		 
		for(int i = num; i <= 10; i++) {
			if(i % 3 != 0 && i % 5 != 0 ) {
				
				System.out.print(i + "+");//여기서 어케 마지막 플러스를 없애야 할까유....
				sum += i;
			}
		}
		System.out.println();
		System.out.println("결과 : " + sum);
		
	}

}
