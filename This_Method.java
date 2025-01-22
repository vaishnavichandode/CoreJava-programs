// Write java program to invoke current class method using this keyword

// logic :


class Example {
    // Method 1
    public void method1() {
        System.out.println("Method 1 is called.");
        // Call method2 using 'this'
        this.method2();
    }

    // Method 2
    public void method2() {
        System.out.println("Method 2 is called.");
    }
}

// Main class
public class This_Method {
    public static void main(String[] args) {
        // Create an object of the Example class
        Example obj = new Example();

        // Invoke method1
        obj.method1();
    }
}


/* output:

Method 1 is called.
Method 2 is called.



*/
