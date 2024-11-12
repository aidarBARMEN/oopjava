package objects;

public class Person {
	private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void walk() {
    	System.out.println(name + " is walking");
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

	public void dance() {
		// TODO Auto-generated method stub
		
	}
}
