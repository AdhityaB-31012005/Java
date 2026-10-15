// package StudentManagement;

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         Boolean isNext=true;
//         Students[] student = new Students[100];
//         int current=0;
//         while(true){
//             System.out.println("1. To Create a New Student\n2. To Display All Students\n3. Exit");
//             int n=sc.nextInt();
//             switch (n) {
//                 case 1:
//                     System.out.print("Enter Student ID : ");
//                     int sId=sc.nextInt();
//                     System.out.print("Enter Student Name : ");
//                     String sName=sc.nextLine();
//                     System.out.print("Enter Student Department : ");
//                     String sDept=sc.nextLine();
//                     System.out.print("Enter Student Age : ");
//                     int sAge=sc.nextInt();

//                     student[current]=new Students(sId, sName, sDept, sAge);
//                     current++;
//                     break;
                
//                 case 2:
//                     for(Students s:student){
//                         System.out.println("Student ID:\t"+s.studentId+"\nStudent Name:\t"+s.studentName+"\nStudent Department:\t"+s.studentDepartment+"\nStudent Age:\t"+s.studentAge+"\n");
//                     }
//                 default:
//                     isNext=false;
//                     break;
//             }
//         }
//     }
// }

package StudentManagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Students[] student = new Students[100];
        int current = 0;

        while (true) {

            System.out.println("\n1. To Create a New Student");
            System.out.println("2. To Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int n = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            switch (n) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int sId = sc.nextInt();
                    sc.nextLine(); // Consume leftover newline

                    System.out.print("Enter Student Name: ");
                    String sName = sc.nextLine();

                    System.out.print("Enter Student Department: ");
                    String sDept = sc.nextLine();

                    System.out.print("Enter Student Age: ");
                    int sAge = sc.nextInt();
                    sc.nextLine(); // Consume leftover newline

                    if (current < student.length) {
                        student[current] = new Students(
                                sId,
                                sName,
                                sDept,
                                sAge
                        );

                        current++;

                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Student array is full!");
                    }

                    break;

                case 2:

                    if (current == 0) {
                        System.out.println("No students found.");
                    } else {

                        System.out.println("\n===== Student Details =====");

                        for (int i = 0; i < current; i++) {

                                                                                                                                                                                                                                    Students s = student[i];

                            System.out.println("Student ID:\t" + s.studentId);
                            System.out.println("Student Name:\t" + s.studentName);
                            System.out.println("Student Department:\t" + s.studentDepartment);
                            System.out.println("Student Age:\t" + s.studentAge);
                            System.out.println("-----------------------------");
                        }
                    }

                    break;

                case 3:

                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}