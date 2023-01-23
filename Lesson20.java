public class Lesson20 {
    public static void main(String[] args) {
        /*Humans human1 = new Humans("Bimbo", 23);
        Humans human2 = new Humans("Name2", 123);
        human1.setName("Anonimus1");
        human1.setAge(1);
        human2.setName("An old Maaan");
        //human1.setAge(47);
        Humans.description = "This is static field of Human's class";
        //Humans.getDescription();
        human1.getAllFields();
        human2.getAllFields();

        System.out.println(Math.pow(2,4));
        System.out.println(Math.PI);
        */
        Humans human1 = new Humans("Bimbo", 23);
        Humans.printNumber();
        Humans human2 = new Humans("Name2", 123);
        Humans.printNumber();
    }
}
class Humans {
    private String name;
    private int age;
    public static String description;
    public static int countPeople;


    //Humans(){
    //    this.name = "Default";
    //    this.age = 20;
    //    System.out.println("Konsructor1");
    //}
    //Humans(String name){
    //    this.name = name;
    //    System.out.println("Konstr2");
    //}
    Humans(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
        //System.out.println("The third constructor");
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void getDescription(){
        System.out.println(description);;
    }
    public void getAllFields(){
        System.out.println(name + ", " +age+ ", "+ description);
    }
    public static void printNumber(){
        System.out.println(countPeople);
    }
}