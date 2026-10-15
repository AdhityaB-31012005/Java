package OOP.ClassObject.EmployeeDemo;

import OOP.ClassObject.ClassDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println(Employee.count);
        Employee e1=new Employee(1,"Adhi",50000,"IT","Developer");
        System.out.println(e1.count);
        Employee e2=new Employee();
        System.out.println(e2.count);
        Employee e3=new Employee();

        System.out.println(e3.count);
        e2.setDate(2,"Harini",50000,"IT","Developer");

        e1.printData();
        System.out.println();
        e2.printData();

        ClassDemo cd=new ClassDemo();

        System.out.println(cd.demo());


    }
}
