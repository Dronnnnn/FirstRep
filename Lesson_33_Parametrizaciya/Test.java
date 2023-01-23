package Lesson_33_Parametrizaciya;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        //========До Java 5=======
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String) animals.get(2);
        System.out.println(animal);

        //========Generics=======
        List<String> animals2 = new ArrayList<String>();
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("Frog");
        String animal2 = animals2.get(2);
        System.out.println(animal2);

        //=====Java 7=====
        List<String> list3 = new ArrayList<>();
    }


}
