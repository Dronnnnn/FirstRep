public class Lesson24 {
    public static void main(String[] args) {
        String str ="Hello";
        System.out.println(str);
        Hum hum1 = new Hum("D", 2);
        System.out.println(hum1);
    }
}

class Hum {
    private String name;
    private int age;
    Hum(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + ", "+ age;
    }
}
