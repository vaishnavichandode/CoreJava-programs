//3.Write a program using exception handling to handle array index out of bounds.

public class ArrayIndexOutOfBoundsExample {

    // Main method
    public static void main(String[] args) {
        
        // declaring array with 3 elements
        int[] numbers = {10, 20, 30};
        
        try {
            // accessing an invalid array index 
            System.out.println("Accessing array element at index 5: " + numbers[5]);
        }
        
        // Catch the ArrayIndexOutOfBoundsException and print error message
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");  // Handling invalid index access
        }
        
        // Program continues after exception handling
        System.out.println("Program continues after handling the exception.");
    }
}

//Output:

/*
Error: Array index is out of bounds!
Program continues after handling the exception.
*/
