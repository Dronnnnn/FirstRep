package Lesson_47_Serialization_3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person person1 = new Person(1, "Habib");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin") )){

            oos.writeObject(person1);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
