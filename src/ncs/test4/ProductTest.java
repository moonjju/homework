package ncs.test4;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명을 입력하세요. :");
		String name = sc.next();
		
		System.out.println("가격을 입력하세요 . : ");
		int price = sc.nextInt();
		
		System.out.println("수량을 입력하세요. : ");
		int quantity = sc.nextInt();
		
		Product p = new Product(name,price,quantity);
	
		 System.out.println(p.information());	
		 
		 System.out.println("총 구매 가격 : " + (price * quantity));
	}	
	

}
