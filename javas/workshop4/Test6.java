package workshop4;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		int num = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 5 사이의 정수를 하나 입력하세요 : ");
	    num =  sc.nextInt();
		int sum = 0;
		int count = 0;

		if(num < 1 && num > 5 && num2 < 1 && num2 >5) {
			System.out.println("숫자를 확인 하세요.");
			return;
			//이부분이 안나옴.. 다시 입력하라는 말만 나옴..
		}else {
		
		System.out.println("두번째 정수를 입력하세요");
		num2 = sc.nextInt();
		int arr[][] = new int[num][num2];
		
		if(arr.length <= 2) {
			for(int i = 0; i < arr.length; i++ ) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (int)(Math.random()*5)+1;
					sum += arr[i][j];
					
					System.out.print(arr[i][j] +" ");
			}
		}
		System.out.printf("%nsum = %.1f%n" ,(double)sum);
			System.out.printf("avg = %.1f%n",(double)sum /arr.length);
		}else {
			System.out.println("다시 입력 하세요.");
			return;
		}
		}
	}
}


