import java.util.Scanner;

public class ArraysDemo{
    public static void main(String[] args){
        // double[] sales = {25000, 30000, 28000, 35000, 32000, 40000};

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number of Data to Enter : ");
        int n=sc.nextInt();

        double[] sales=new double[n];
        double total=0;
        for(int i=0;i<n;i++){
            System.out.print("Enter the data "+(i+1)+" : ");
            sales[i]=sc.nextDouble();
            total = total + sales[i];
        }

        // double total = 0;

        // for (int i = 0; i < sales.length; i++) {
        //     total = total + sales[i];
        // }

        System.out.println("Total Sales =" + total);
    }
}