import javax.swing.*;

public class ClassesAndObjects {
    public static void main(String[] args) {
       Person chel = new Person();
            //chel.setNameAndAge("", -47);
            //Не правильно обрщаться к полям класса напрямую
            //chel.name ="ABOBA";
            //chel.age = 47;
            //chel.speak();
            //chel.sayAloha();
            //System.out.println("Первый - "+ chel.name+", "+ chel.age);
       String sName = "Peter";
       int userage = 46;
       Person chelibos = new Person();
            //chelibos.setNameAndAge(sName, userage);
            //chelibos.name = "Vope";
            //chelibos.age =322;
            //chelibos.speak();
            //chelibos.speak();
            //chelibos.sayAloha();
            ////System.out.println("Второй - "+chelibos.name+", "+chelibos.age);
            //int year1 = chel.calulateYearsToRetirement();
            //int year2 = chelibos.calulateYearsToRetirement();
            //System.out.println("First needs "+ year1 +" and second needs "+ year2);
       chel.setName(sName);
       System.out.println("Засетили погоняло: "+ chel.getName());
       chel.setAge(userage);
       System.out.println("Старик, тебе уже "+ chel.getAge());
       chel.speak();
       chel.sayAloha();




    }
}
class Person{
    //1.Данные - поля
    //2.Действия - методы
    private String name;
    private int age;
    int i = 1;
    public void setName(String username){
        if (username.isEmpty()){
            System.out.println("Name is empty");
        } else{
            name = username;
        }
    }
    public void setAge(int userage){
        if (userage<0) {
            System.out.println("Age must be positive");
        }else{
            age = userage;
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    int calulateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }
    void speak(){
        do {
            System.out.println("Person's name is "+ name+ " and age is "+ age);
            i++;
        } while (i<1);

    }
    void sayAloha(){
        System.out.println("Aloha!");
    }
}