import java.util.Scanner;

public class SumOfNumbers {
public static void main(String[]arg){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number.");
    int x=sc.nextInt();
    System.out.println("enter secont number.");
    int y=sc.nextInt();
    int result=0;
    for(;x<=y; x++){
        result+=x;
    }
    System.out.println(result);
}





}


