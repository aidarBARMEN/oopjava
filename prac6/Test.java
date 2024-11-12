package prac6;

//import Cat;
//import Student;
//import Restaurant;

public class Test {
    public static void main(String[] args) {
        Restaurant delpapa = new Restaurant();

        //kошка может есть пиццу
        Cat cat = new Cat(null, 0); 
        delpapa.servePizza(cat);

        //sтудент может есть пиццу, танцевать, retake и двигаться
        Student student = new Student(null, 0); // same
        delpapa.servePizza(student);
  
        student.move();
        
    }
}

