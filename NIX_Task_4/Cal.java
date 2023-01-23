package NIX_Task_4;

import java.util.Scanner;

public class Cal {

    public static void solution(String input){
        String[] split = input.split(" ");

        Double dig1 = Double.parseDouble(split[0]);
        Double dig2 = Double.parseDouble(split[1]);

        switch (split[2]){
            case ("sum"):
                System.out.format("%s + %s = %s", dig1, dig2, dig1+dig2);
                break;
            case ("sub"):
                System.out.println(dig1-dig2);
                break;
            case ("mul"):
                System.out.println(dig1*dig2);
                break;
            case ("div"):
                System.out.println(dig1/dig2);
                break;

        }

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        solution(input);
        scanner.close();
    }

}
