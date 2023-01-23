package Lesson_38_Exceptions2;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Введи ноль, больше ничего не прошу");
           int numb = Integer.parseInt(scanner.nextLine());

           if(numb != 0){
               throw new ScannerException("Number is not 0");
           }
        }
    }
}
