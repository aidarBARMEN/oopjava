package prac6;

public class Student extends Person  implements CanHavePizza, CanHaveRetake, CanHaveParty, Movable{
	private int balance;
	public Student(String name, int age, int balance) {
		super(name, age);
		this.balance = balance;
	}
		public void eatPizza() {
			
			System.out.println("Student is eating pizza");
		}



		@Override
		public void move() {
		    System.out.println("Student is moving");
		}
		
		
		public void retake() {
			System.out.println("Student is taking retake");
		}
		@Override
		public void haveParty() {
			System.out.println("Student have a party");
			
		}
		@Override
		public void getRetake() {
			// TODO Auto-generated method stub
			System.out.println("Student got retake");
		} 
	}

