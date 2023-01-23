package Lesson_45_Serialization;

import Lesson_45_Serialization.Person;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {

        Person[] people = {new Person(1, "Ha"),
                new Person(2, "Bib"), new Person(3, "Kek")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //oos.writeInt(people.length);
            //Сериализация массивов
            //for(Person person : people){
            //    oos.writeObject(person);
            //}
            oos.writeObject(people);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
