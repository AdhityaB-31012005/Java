import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter a number.");
    int n=Sc.nextInt();
    for(int i=1; i<=10;i++){

    System.out.println(n+"*" +i+"="+(n*i));
}
System.out.println("while loop.");
int i=1;
  while(i<=10){
    System.out.println(n+"*"+i+"="+(n*i));
    i++;
  }
}
}

