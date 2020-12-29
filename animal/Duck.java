package kh.java.polymorphism.animal;

public class Duck extends Animal{

	public void bite() {
		System.out.println("부리 공격!! 꽉꽉꽉꽉꽉!!!!!");
	}
 @Override
 public void attack() {
	 bite();
 }
 @Override
	public void say() {
		System.out.println("안뇽 난 오리");
	}
}
