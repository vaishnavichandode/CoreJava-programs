// Write a program to check given number is prime number or not


// logic :


import java.util.Scanner;

public class PrimeNumberCheck {

    //  check if a number is prime
    public static boolean prime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for divisors from 2 to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible, so it's not prime
            }
        }

        return true; // Number is prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number to check if it is a prime number: ");
        int number = sc.nextInt();

        // Check and display result
        if (prime(number)) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}



/*   output:

Enter a number to check if it is a prime number: 14
14 is not a Prime Number.


Enter a number to check if it is a prime number: 4
4 is not a Prime Number.


*/
