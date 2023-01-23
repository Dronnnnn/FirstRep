package Lesson_32_Preobrazovaniya_Voshodashie_Nishodyashie;

public class Test {
    public static void main(String[] args) {
        ////Upcastiong - восходящее преобразование
        //Dog dog = new Dog();
        //Animal animal = dog;

        ////Downcasting - нисходящее преобразование
        //Dog dog2 = (Dog) animal;
        //dog2.bark();

        Animal animal = new Animal();
        Dog dog = (Dog) animal;
        dog.bark();
    }
}
