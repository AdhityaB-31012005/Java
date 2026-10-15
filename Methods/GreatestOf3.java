package Methods;

import java.util.Scanner;

public class GreatestOf3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1=sc.nextInt();

        System.out.print("Enter Number 2 : ");
        int num2=sc.nextInt();

        System.out.print("Enter Number 3 : ");
        int num3=sc.nextInt();

        GreatestOf3 ob=new GreatestOf3();
        ob.maxOf3(num1,num2,num3);

        ob.maxOf3(10,20,15);

    }

    void maxOf3(int a,int b,int c){
        if(a>b && a>c)System.out.println(a+" is greatest number.");
        else if(b>c) System.out.println(b+" is the greatest number.");
        else System.out.println(c+" is the greatest number.");
    }
}
