package Lesson_36_Reading_From_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String pathname = separator + "Users" + separator + "Dron_n" + separator + "Desktop" + separator + "kek.txt";
        String pathname2 = "Test2";//Для файла расположенного в корне проекта
        File file = new File(pathname);
        File file2 = new File(pathname2);

        Scanner scanner = new Scanner(file);
        Scanner scanner2 = new Scanner(file2);
        String line = scanner.nextLine();
        String line2 = scanner2.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;
        for (String number: numbersString){

            numbers[counter++] = Integer.parseInt(number);

        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(line2);
        scanner.close();
    }
}
