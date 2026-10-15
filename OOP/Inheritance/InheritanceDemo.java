package OOP.Inheritance;



public class InheritanceDemo extends Demo{

    public void getDetails(){
        System.out.println("Main is called");
    }
    public static void main(String[] args){

        InheritanceDemo demo=new InheritanceDemo();

        demo.getDetails();
        demo.getDetailsDemo();

    }
}