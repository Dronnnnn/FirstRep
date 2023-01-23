package Lesson_41_Abstract_Classes;

public abstract class Animal {
    String name = "Bobik";
    public void eat(){
        System.out.println("Animal is eating");

    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public abstract void makeSound();
}

