package kh.java.polymorphism.animal;

public class AnimalMain {

	public static void main(String[] args) {
		AnimalMain am = new AnimalMain();
//		am.test1();
//		am.test2();
	//	am.test3();
		
		//다형성 활용
		//1.매개변수 선언부
	//	am. test4();

		//2. 리턴값 처리
		//am.test5();
		
		//동적 바인딩
		//am.test6();
		
		//추상메소드
	//	am.test7();
		
		//인터페이스
		am.test8();
	
	}
	
	/**
	 *  인터페이스는 객체화 할 수 없다.
	 *  인터페이스 역시 부모타입으로 다형성을 작용할 수 있다.
	 */
	public void test8() {
	//	Runnable r = new Runnable(); //Cannot inst
		
		Runnable r1 = new Dog();
		Runnable r2 = new Cat();
		
		r1.run();
		r2.run();
		
//		r1.say();//Animal 재작성 메소드 say
//		r1.attack();//Animal 재작성 메소드 attack
//		r1.kick();//Dog의 kick
		((Dog)r1).say();
		((Dog)r1).attack();
		((Dog)r1).kick();
		
		//상수
		System.out.println(Runnable.LEGS);
		
		Bitable b1 = new Dog();
		Bitable b2 = new Cat();
		b1.bite("멍멍~");
		b2.bite("냥냥!");
		System.out.println("-----------------------");
		
		Dog d1 = (Dog)b1;
		d1.attack();
		d1.bite("왈");
		d1.kick();
		
		System.out.println("-----------------");
		Animal a1 = d1;
		a1.attack();
		a1.say();
		
		System.out.println("--------------");
		Flyable f1 = new Eagle();
		f1.fly("yes");
		
		Eagle e1 =(Eagle)f1;
		e1.attack();
		e1.fly("yes");
		
		
		
	
		
		
	}
	
	
	
	/**
	 * 추상클래스 Animal
	 * 
	 */
	public void test7() {
	//Animal a = new Animal;// Cannot instantiate the type Animal	
		Animal a = new Cat();
		Animal b = new Dog();
		Animal c = new Duck();
		//추상클래스 Animal을 상속한 자식 클래스는 
		// 무조건 추상메소드 attack구현을 보장받는다.
		a.attack();
		b.attack();
		c.attack();
		
	}
	/**
	 * 동적바인딩
	 * 1. 상속 & 부모 클래스의 메소드를 오버라이딩
	 * 2. 자식객체를 부모타입으로써 제어, 해당메소드 호출
	 * 자동으로 자식타입의 재작성한 메소드가 호출 된다.
	 * 다운캐스팅 없이 자식메소드 사용가능
	 * 
	 * 정적바인딩
	 * 동일한 타입의 메소드를 호출한다.
	 * 
	 */
	public void test6() {
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		a1.say();
		a2.say();
		
		//다형성을 이용한 attack
		Animal[] arr = new Animal[100];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0)
				arr[i] = makeDog();
			else
				arr[i] = makeCat();
		}
		//실행
		for(Animal anm : arr)
			anm.attack();//동적바인딩 자식클래스의 오버라이드한 메소드가 호출된다.
	}
	
	/**
	 * 리턴값을 다형성 이용하여 처리하기
	 */
	public void test5() {
		Animal cat = makeCat();
		Animal dog = makeDog();
		
		
		Animal[] arr = new Animal[100];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0)
				arr[i] = makeDog();
			else
				arr[i] = makeCat();
		}
		
		for(Animal anm : arr)
			attack(anm);
	}
	public Dog makeDog() {
		return new Dog();
	}
	
	public Cat makeCat() {
		return new Cat();
	}
	
	/**
	 * 매개변수 선언부에서 다형성 활용하기
	 * 
	 */
	public void test4() {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		attack(cat);
		attack(dog);
	
			
	}
	public void attack(Animal animal) {
		if(animal instanceof Cat) {
			((Cat)animal).punch();
			}
			
			else if(animal instanceof Dog) {
			((Dog)animal).kick();
			}
	}
	
	//오버로딩
//	public void attack(Cat cat) {
//		cat.punch();
//	}
//	public void attack(Dog dog) {
//		dog.kick();
//	}
//	
	/**
	 * 부모타입의 배열에 자식객체를 담을 수 있다.
	 *
	 */
	public void test3() {
		
		Animal[] arr = new Animal[3];
		arr[0]  = new Cat();
		arr[1]  = new Dog();
		//arr[2]  = new Animal();//추상클래스를 만들면 이렇게 객체 생성이 안됀다 .
		arr[2] = new Cat();
		
		System.out.println(arr[0] instanceof Cat);//t
		System.out.println(arr[0] instanceof Dog);//f
		System.out.println(arr[0] instanceof Animal);//t
		System.out.println(arr[0] instanceof Object);//t
		
		
		for(Animal anml : arr) {
			anml.say();
			
			//instanceof 해당타입의 객체인 경우 true 리턴
			//true가 리턴된 경우, 해당타입으로의 안전한 형변환 보장
			//Cat객체인 경우
			if(anml instanceof Cat) {
			((Cat)anml).punch();
			}
			//Dog객체인 경우
			else if(anml instanceof Dog) {
			((Dog)anml).kick();
			}
		}
		
	}
	
	
	
/**
 * 형변환
 *  - upcasting 부모타입으로 형변환. 자동(암묵적)형변환 
 *  - downcasting 자식 타입으로 형변환. 수동(명시적)형변환
 * 
 * 	
 */
	public void test2() {
		
		Animal animal = new Dog();// upcasting
		Dog dog = (Dog)animal; //downcasting
		
		dog.kick();
	}
	
	
/**
 * 자식객체를 부모타입의 참조변수에 담아 제어할 수있다.
 * 단, 자식 클래스에 선언된 자원은 사용할 수 없다.
 * 
 * 
 */
	public void test1() {
		
		Cat cat = new Cat();
		cat.say();
		cat.punch();
		
		Animal animal1 = cat;
		System.out.println(cat == animal1); //주소값 비교
		animal1.say();
	//	animal1.punch(); 부모 타입 변수에 담으면 자식클래스에 선언된 자원( 필드,메소드)를 사용할 수 없다.
		
		Object obj1 = cat;
//		obj1.say();
//		obj1.punch();
		System.out.println(obj1.hashCode());
		
		System.out.println("---------------");
		//다시 자식타입의 변수에 담으면 자식타입의 자원 사용가능
//		Animal animal2 = (Animal)obj1;
//		animal2.say();
		((Animal)obj1).say();//우선순위때문에 괄호가 필요
		
//		Cat cat2 = (Cat)animal2;
//		cat2.punch();
	    ((Cat)obj1).punch();
	    //((Dog)obj1).kick(); 무턱대고 형변환 할 수 없다.
		
	}
}