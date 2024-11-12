package objects;

import interfaces.CanHaveParty;
import interfaces.CanHavePizza;
import interfaces.CanHaveRetake;
import interfaces.Movable;

public class Student extends Person implements CanHavePizza, CanHaveRetake, CanHaveParty, Movable {

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void eatPizza() {
		System.out.println("Student is eating pizza");
	}

	@Override
	public void dance() {
	    System.out.println("Student is dancing");
	}

	@Override
	public void move() {
	    System.out.println("Student is moving");
	}
	
	
	public void retake() {
		System.out.println("Student is taking retake");
	} 
}
