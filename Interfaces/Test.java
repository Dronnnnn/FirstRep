package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(2);
        Person person1 = new Person("Bob");
        //animal1.sleep();
        //person1.sayHello();
        //animal1.showInfo();
        //person1.showInfo();
        //Info info1 = new Animal(1);
        //Info info2 = new Person("qew");
        //info1.showInfo();
        //info2.showInfo();
        outputInfo(animal1);
        outputInfo(person1);
    }
    public static void  outputInfo(Info info){
        info.showInfo();
    }
}
