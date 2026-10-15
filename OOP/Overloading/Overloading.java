package OOP.Overloading;

import java.util.*;

public class Overloading{
    int intcount=0;
    int floatcount=0;
    int triplecount=0;
    public int add(int a,int b){
        intcount++;
        return a+b;
        
    }
    public int add(int a,int b,int c){
        triplecount++;
        return a+b+c;
    }
    public float add(float a,float b){
        floatcount++;
        return a+b;
    }

    public static void main(String[] args) {
        Overloading over=new Overloading();

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(over.add(a,b));
        System.out.println(over.add(a,b,c));
        System.out.println(over.add((float)a,(float)b));
        System.out.println(over.add(b,c));

        System.out.println(over.intcount);
        System.out.println(over.floatcount);
        System.out.println(over.triplecount);
    }
}