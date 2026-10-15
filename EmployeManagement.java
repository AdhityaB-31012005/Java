import java.util.Scanner;
public class EmployeManagement{
public static void main(String[] arg){
Scanner Sc =new Scanner(System.in);
System.out.print("Enter employe name");
String name=Sc.nextLine();
System.out.print("Enter employe role");
String role=Sc.nextLine();
System.out.print("Enter employe department");
String department=Sc.nextLine();
System.out.print("Enter employe salary");
int salary=Sc.nextInt();
System.out.println("Name"+name);
System.out.println("Role"+role);
System.out.println("Department"+department);
System.out.println("Salary"+salary);
}
}