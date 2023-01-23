package Lesson_35_Anon_classes;

//class Animal {
//
//    public void eat(){
//        System.out.println("Animal is eating");
//    }
//}

interface AbleToEat{
    public void eat();
}
//class Animal implements AbleToEat{
//
//    @Override
//    public void eat() {
//    System.out.println("Animal is eating");
//    }
//}
//class otherAnimal extends Animal{
//    @Override
//    public void eat() {
//        System.out.println("Other animal is eating (переопределенный метод в классе-наследнике)");
//    }
//}

public class Test{
    public static void main(String[] args) {
        //Animal animal = new Animal();
        //animal.eat();

        //otherAnimal otherAnimal = new otherAnimal();
        //otherAnimal.eat();
       // Animal animal2 = new Animal(){
       //     @Override
       //     public void eat() {
       //         System.out.println("Other animal is eating ");
       //     }
       // };
       // animal2.eat();


        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Anon class is eating");
            }
        };
        ableToEat.eat();
    }

}
