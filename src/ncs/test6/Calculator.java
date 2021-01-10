package ncs.test6;

public class Calculator {
	
	public double getSum(int data) throws InvalidException{
		
		if(!(data>=2 && data<=5))//아니라면 이라는 !빼먹어서 오류가 났다.
			
			throw new InvalidException("입력 값에 오류가 있습니다.");// 응용법이 어려워서 해맸다.
		int sum=0;
		for(int i=1;i<=data; i++) {
			sum+=i;
		}
		return sum;
	}
}//여기서 2-5사이의 값이 아닐 경우의 코드를 생성한다.