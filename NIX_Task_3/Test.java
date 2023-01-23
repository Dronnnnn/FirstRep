package NIX_Task_3;


import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullname = scanner.nextLine();
        String[] separate = fullname.split(" ");
        for (String word: separate
             ) {
            System.out.println(word);

        }
        scanner.close();
    }
}
