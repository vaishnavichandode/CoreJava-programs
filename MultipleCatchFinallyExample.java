//2.Write a program demonstrating multiple catch statements and finally block.

public class MultipleCatchFinallyExample {

    // Main method 
    public static void main(String[] args) {
        
        // declaring array with 3 elements
        int[] numbers = {10, 20, 30};

        try {
            // Code that may throw multiple exceptions
            
            // ArithmeticException: Division by zero
            int result = 10 / 0;  // This will throw ArithmeticException
            System.out.println("Result of division: " + result);
            
            // ArrayIndexOutOfBoundsException: Accessing an invalid index
            System.out.println("Accessing an invalid array element: " + numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        }
        
        // Catching ArithmeticException and printing a error message
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!"); // Handling division by zero
        }
        
        // Catching ArrayIndexOutOfBoundsException and printing a error message
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!"); // Handling invalid array index access
        }
        
        // Finally block
        finally {
            System.out.println("This block will always execute, regardless of exception.");
        }

        // Program continues after the exception handling and finally block
        System.out.println("Program continues after exception handling.");
    }
}

//Output:
/*
Error: Division by zero is not allowed!
This block will always execute, regardless of exception.
Program continues after exception handling.
*/
