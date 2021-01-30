package account;

public class AccountTest2 {

	public static void main(String[] args) {
		
			Account [] arr = new Account [5];
		
			for(int i = 0; i < arr.length; i++) {
				arr[i]= new Account ("221-1010-211"+ i,100000,4.5);
			}
			
			for(Account ac : arr){
				ac.accountInfo();
				System.out.println();
			}
			
			for(int i = 0; i < arr.length; i++) {
				arr[i]= new Account ("221-1010-211"+ i,100000,3.7);
			}
			
			for(Account ac : arr){
				ac.accountInfo();
				System.out.printf("이자: %.0f원",ac.calculateInterest());
				System.out.println();
			}
	}

}
