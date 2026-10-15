import java.util.Scanner;
public class StudentMark{
public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
System.out.print("Enter student name \t:");
String studentName=sc.nextLine();
System.out.print("enter tamilmark \t:");
int tamilMark=sc.nextInt();
System.out.print("enter englishmark \t:");
int englishMark=sc.nextInt();
System.out.print("enter mathsmark \t:");
int mathsMark=sc.nextInt();
System.out.print("enter sciencemark \t:");
int scienceMark=sc.nextInt();
System.out.print("enter socialmark \t:");
int socialMark=sc.nextInt();
int totalMark=tamilMark+englishMark+mathsMark+scienceMark+socialMark;
double Average= totalMark /5;
if(Average>=35){
System.out.println("the Student "+studentName+" is passed");
System.out.println("your totalmark is "+totalMark);
System.out.println("your average is "+Average);
if(Average>96){
    System.out.println("your grade is A+");
}
else if(Average>90){
    System.out.println("your grade is A");
}
else if(Average>85){
    System.out.println("your grade is B");
}
else if(Average>75){
    System.out.println("your grade is C");

}
else if(Average>50){
    System.out.println("your grade is E");
}

else{
    System.out.println("your grade is F");
}
}
else{
    System.out.println("the student "+studentName+" is failed");
    System.out.println("your totalmark is "+totalMark);
    System.out.println("Your average is "+Average);
}
}
}


