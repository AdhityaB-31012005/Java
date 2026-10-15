package Methods;
public class MethodPractice {

    // 1. A simple method that does not take parameters and does not return anything (void)
    public static void printWelcomeMessage() {
        System.out.println("=== Welcome to the Java Method Practice Program! ===");
    }

    // 2. A method that takes a parameter but does not return anything
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Let's learn how methods work.");
    }

    // 3. A method that takes parameters and returns a value (int)
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum; // Sends the result back to where it was called
    }

    // 4. Method Overloading: Same name as above, but accepts double values instead of ints
    public static double addNumbers(double num1, double num2) {
        return num1 + num2;
    }

    // 5. A method that uses conditional logic and returns a boolean
    public static boolean isEven(int number) {
        return number % 2 == 0; 
    }

    // The main method: This is where execution begins!
    public static void main(String[] args) {
        
        // Calling Method 1: No inputs, no outputs
        printWelcomeMessage();
        System.out.println(); // Prints a blank line

        // Calling Method 2: Passing a String argument
        greetUser("Adhitya");
        System.out.println();

        // Calling Method 3: Storing the returned integer value in a variable
        int integerResult = addNumbers(15, 25);
        System.out.println("Result of adding integers (15 + 25): " + integerResult);

        // Calling Method 4: The compiler automatically chooses the double version
        double decimalResult = addNumbers(5.5, 4.5);
        System.out.println("Result of adding decimals (5.5 + 4.5): " + decimalResult);
        System.out.println();

        // Calling Method 5: Using the returned boolean directly in an if-statement
        int checkNum = 42;
        if (isEven(checkNum)) {
            System.out.println(checkNum + " is an even number.");
        } else {
            System.out.println(checkNum + " is an odd number.");
        }
    }
}