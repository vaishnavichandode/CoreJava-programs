//  1.Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.


// logic :

public class ArithmeticException {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result;

        try {
            // Attempt to divide by zero, which will throw an ArithmeticException
            result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch the ArithmeticException and display 
            System.out.println("Error: Division by zero is not allowed.");
         } 
    }
}


/* output:
   Error: Division by zero is not allowed.


*/