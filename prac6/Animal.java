package prac6;

public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void sleep() {
		System.out.println(name + "is sleeping");
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
