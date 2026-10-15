package OOP.ClassObject.EmployeeDemo;

public class Employee {
    int employeeId;
    String employeeName;
    double employeeSalary;
    String employeeDepartment;
    String employeeDesignation;
    static int count=0;

    Employee(){
        count+=1;
    }

    Employee(int id,String name,double salary,String dept,String desig){
        this.employeeId=id;
        this.employeeName=name;
        this.employeeSalary=salary;
        this.employeeDepartment=dept;
        this.employeeDesignation=desig;
        count+=2;
    }

    public void setDate(int id,String name,double salary,String dept,String desig){
        this.employeeId=id;
        this.employeeName=name;
        this.employeeSalary=salary;
        this.employeeDepartment=dept;
        this.employeeDesignation=desig;
    }

    public void printData(){
        System.out.println("Employee ID : "+employeeId);
        System.out.println("Name : "+employeeName);
        System.out.println("Salary : "+employeeSalary);
        System.out.println("Department : "+employeeDepartment);
        System.out.println("Designation : "+employeeDesignation);
    }
}
