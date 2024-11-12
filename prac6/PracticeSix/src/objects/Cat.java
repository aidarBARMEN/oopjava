package objects;

import interfaces.CanHavePizza;

public class Cat extends Animal implements CanHavePizza {
	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public void eatPizza() {
		 System.out.println("Cat is eating pizza");
	}
}
