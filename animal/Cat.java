package kh.java.polymorphism.animal;

public class Cat extends Animal implements Runnable, Bitable{

	public void punch() {
		System.out.println("냥냥펀치!!!");
	}
	@Override
	public void attack() {
		punch();
	}

	@Override
	public void say() {
		System.out.println("안뇽 난 냥");
	}
	@Override
	public void run() {
		System.out.println("냥냥이도 뽀짝 걷습니다.");
	}
	public void bite(String sound) {
		System.out.println("냥냥이는 물어요" + sound);
	}
}
