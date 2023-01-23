package Lesson_37_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("123");
        Scanner scanner = new Scanner(file);
    }

}