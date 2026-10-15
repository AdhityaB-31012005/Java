package OOP.ClassObject;

public class Student {
    String name;
    int age;
    void display(){
        System.out.println("Name:+name");
         System.out.println("Age:+age");
    }
    public static void main(String[] args){
        Student S1=new Student();
        S1.name="siva";
        S1.age=35;
    }
}
