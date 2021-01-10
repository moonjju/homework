package ncs.test5;

public class BookArrayTest {

	public static void main(String[] args) {
		
		
		Book bArray [] = new Book[3];
		
			bArray[0]= new Book("자바의 정석", "남궁성", "도우출판", 30000, 0.1);
			bArray[1]= new Book("열혈강의 자바", "구정은", null, 29000, 0.1);
			bArray[2]= new Book("객체지향 JAVA8", "금영욱",null, 30000, 0.1);
		
		for(int i = 0; i <bArray.length; i++) {
			
			Book b = bArray[i];
			if(b.getPublisher() != null) {
			System.out.printf("%s, %s, %s, %s원, %.0f%%할인%n 할인된 가격 : %s%n", b.getTitle(),b.getAuthor(), b.getPublisher(),b.getPrice(),
					                              (b.getDiscountRate()*100),(b.getPrice() - (b.getPrice()*10 /100)) );
			
//			System.out.println(b.getTitle() + ", " + b.getAuthor() + 
//					      ", " + b.getPublisher() + ", " + b.getPrice() +"원, " +
//					         (b.getDiscountRate()*(100)) + "%할인" + "\n할인된 가격  : " +
//					        (b.getPrice() - (b.getPrice()*10 /100)) );
		
			}else {
				System.out.printf("%s, %s, %s원, %.0f%%할인%n 할인된 가격 : %s%n", b.getTitle(),b.getAuthor(),b.getPrice(),
                        (b.getDiscountRate()*100),(b.getPrice() - (b.getPrice()*10 /100)) );
			}
			}

	}

}
