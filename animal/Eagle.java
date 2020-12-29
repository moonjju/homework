package kh.java.polymorphism.animal;

public class Eagle extends Animal implements Flyable {

	public void peek() {
		System.out.println("부리로 쪼기!");
	}
	
	@Override
	public void fly(String yn) {
		System.out.println("날수 있습니까?" + yn);
	}

	@Override
	public void attack() {
		peek();
		
	}

	
}
