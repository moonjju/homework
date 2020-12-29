package kh.java.polymorphism.animal;

public class Dog extends Animal implements Runnable, Bitable{
	
	public void kick() {
		System.out.println("멍멍킥! 발사!!");
	}
	@Override
	public void attack() {
		kick();
	}
	@Override
	public void say() {
		System.out.println("안뇽 난 댕댕");
	}
	@Override
	public void run() {
		System.out.println("댕댕이는 뽀짝 걷습니다");
	}
	
	@Override
	public void bite(String sound) {
		System.out.println("댕댕이는 물어요" + sound);
	}
}
