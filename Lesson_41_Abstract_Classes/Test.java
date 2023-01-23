package Lesson_41_Abstract_Classes;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.makeSound();
        cat.makeSound();
        cat.eat();
        System.out.println(cat.name);
    }
}
