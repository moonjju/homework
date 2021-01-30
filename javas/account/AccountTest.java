package account;

public class AccountTest {

	public static void main(String[] args) {
		
		Account a = new Account("441-0290-1203",500000, 7.3);
		
		System.out.println("계좌정보 :"+a.getAccount() +" 잔액 :"
		                  +a.getBalance() +" 이율 :" +a.getInteresRate()+"%" );
	
		a.deposit(20000);
	
		System.out.println("계좌정보 :"+a.getAccount() +" 잔액 :"
                +a.getBalance() +" 이율 :" +a.getInteresRate()+"%" );
		
		System.out.println("이자: "+a.calculateInterest());
	
	}

}
