import java.util.Locale;

public class Lesson23 {
    public static void main(String[] args) {
        //String str = "Kekos";
        //str = str.toUpperCase(Locale.ROOT;
        //System.out.println(str);
        //String str1 = "Hello";
        //String str2 = ", ";
        //String str3 = "username!";
        //String strAll = str1+str2+str3;
        //System.out.println(strAll);
        //System.out.println(str1+str2+str3);
        //StringBuilder sb =new StringBuilder("Hello");
        //System.out.println(sb.toString());
        //sb.append(", ");
        //sb.append("jopniki").append("!");
        //System.out.println(sb);

        //========Formatting Strings===========

        System.out.printf("Some string %s formatted %d times, any float digit %f <--- here\n", "has been", 3, 324.123);
        ///int b = 3;

        //for (int i = 0; i < 10; i++){
        //System.out.printf("Start:%-10d :finish \n",b);
        //b = b*10;
        //}
        System.out.printf("Ограничение чисел после запятой %.2f\n",1.1234567890);
        System.out.printf("Ограничение чисел после запятой %.4f\n",1.1234567890);
        System.out.printf("Ограничение чисел после запятой %.6f\n",1.1234567890);

    }
}
