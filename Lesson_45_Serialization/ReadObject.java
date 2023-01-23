package Lesson_45_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //int personCount = ois.readInt();
            //Person[] people = new Person[personCount];
// Сериализация массивов
            //for(int i = 0; i< personCount; i++){
            //    people[i] = (Person) ois.readObject();
            //    System.out.println(people[i]);
            //}

            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }


    }
}
