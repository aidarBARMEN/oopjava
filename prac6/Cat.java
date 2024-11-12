package prac6;

public class Cat extends Animal implements CanHavePizza {
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void eatPizza() {
		 System.out.println("Cat is eating pizza");
	}


}
