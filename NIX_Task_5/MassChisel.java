package NIX_Task_5;

public class MassChisel {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,7,15};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i : new int[]{1, 2, 3, 4, 7, 15}) {
            System.out.println(i);
        }

    }
}
