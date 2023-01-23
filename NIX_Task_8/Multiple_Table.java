package NIX_Task_8;

public class Multiple_Table {
    public static void main(String[] args) {
        int[] dig1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int res;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                res = dig1[i] * dig1[j];
                System.out.format("%s * %s = %s", dig1[i], dig1[j], res);
                System.out.println();

            }
            System.out.println();
        }
    }
}
