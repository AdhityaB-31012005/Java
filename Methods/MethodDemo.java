package Methods;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number 1");
        int n=sc.nextInt();

        String result=isOddEven(n);
        System.out.println(result);
        System.out.print("Enter Number 2");
        int m=sc.nextInt();
        result=isOddEven(m);
        System.out.println(result);
    }

    static String isOddEven(int n){
        if(n%2==0)return"Even Number";
        else return "Odd Number";
    }
    
}
