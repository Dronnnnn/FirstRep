import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input age");
        String age = scanner.nextLine();
        switch (age){
            case "Zero" :
                System.out.println("Darova");
                break;
            case "Sem" :
                System.out.println("Shkolota");
                break;
            case "Mnogo" :
                System.out.println("Ne shkolota");
                break;
            default:
                System.out.println("Ti kto voobshe?");
                break;
        }
    }
}
