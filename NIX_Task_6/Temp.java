package NIX_Task_6;

import java.util.Scanner;

public class Temp {

    public static void toCel(int far){
        double cel = (far - 32)/1.8;
        //System.out.println(cel);
        //double roundCel = new BigDecimal(cel).setScale(3, RoundingMode.HALF_EVEN).doubleValue();
        //System.out.println(roundCel);
        int num = (int)(cel);
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int far = scanner.nextInt();
        toCel(far);
    }
}
