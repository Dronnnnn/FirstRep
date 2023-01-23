public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] number = {1,2,23};
        int[][] matrice ={{1,2,3,45,436465},{4,5,6},{7,8,9}};
        System.out.println(matrice[2][2]);
        System.out.println(matrice[1][0]);
        System.out.println(matrice[0][4]);
        String [][] multistring = new String[99][99];
        multistring[0][1] = "Hello";
        System.out.println(multistring[0][1]);
        for(int i = 0;i<matrice.length;i++ ){
            for (int j = 0;j<matrice[i].length;j++){
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println();
        }
    }
}
