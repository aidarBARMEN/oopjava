package prac6;

//import CanHavePizza;
//import Person;

public class Restaurant {
	public boolean servePizza(CanHavePizza eater) {
		eater.eatPizza();
		if (eater instanceof Person) {
			System.out.println("Processing payment for the person");
		} else {
			System.out.println("Not a person, no payment needed");
		}
		return true;
	}
}
