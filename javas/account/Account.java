package account;

public class Account {

	private String account; //계좌 정보 내역
	private int balance; // 잔액
	private double interesRate;// 이자
	
	public Account() {}

	public Account(String account, int balance, double interesRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interesRate = interesRate;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInteresRate() {
		return interesRate;
	}

	public void setInteresRate(double interesRate) {
		this.interesRate = interesRate;
	}
	
	public double calculateInterest() {
		return balance*(interesRate/100);
		//현재잔액을 기준으로 이자를 계산 한다	
	}
	public void deposit(int money) { //입금
		setBalance(balance += money);
		 
	}
	
   public void withdraw(int money) {//출금
	  if(balance >= money) {
		  setBalance(balance -= money);
	  }
	}
   public void accountInfo() {
	   System.out.printf("계좌번호 : %s 잔액 : %s 이자율 : %.1f %%" ,this.account ,this.balance,this.interesRate);
   }//8번 문제
   
}
