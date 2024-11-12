package test;

import objects.Cat;
import objects.Student;
import service.Restaurant;

public class Test {
    public static void main(String[] args) {
        Restaurant delpapa = new Restaurant();

        //kошка может есть пиццу
        Cat cat = new Cat(null, 0); //why here default args, what if add setters in cat
        delpapa.servePizza(cat);

        //sтудент может есть пиццу, танцевать, retake и двигаться
        Student student = new Student(null, 0); // same
        delpapa.servePizza(student);
        student.dance(); 
        student.move();
        
    }
}

