package NIX_Task_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum {
    static int sum;
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> digits = new ArrayList<>();
        int[] array = new int[10];
        while (num > 0){
            digits.add(num % 10);
            num /= 10;
            //System.out.println(digits);
        }
        for (int dig:digits
             ) {
            sum += dig;
        }
        System.out.println(sum);
        scanner.close();
    }

}
