package Exception;

import java.util.*;

public class ExceptionHandling extends Exception{
    public static void main(String[] args){
        try{
            int result=5/0;
            int result2=5/3;
            System.out.println(result2);
        }
        catch(Exception e){
            System.out.println("Divisible by zero" + e);
        }
        System.out.println(5/3);
        
    }
}
