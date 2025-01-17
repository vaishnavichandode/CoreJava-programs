// Write a java program to check given number is perfect number or not

// logic :

import java.util.Scanner;

public class PerfectNumberCheck {

    //  check if a number is perfect
    public static boolean perfectNumber(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not perfect
        }

        int sum = 0;

        // Find all divisors of the number and their sum
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number to check if it is a perfect number: ");
        int number = sc.nextInt();

        // Check and display result
        if (perfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }

        
    }
}



/*   output:

Enter a number to check if it is a perfect number: 10
10 is not a Perfect Number.

Enter a number to check if it is a perfect number: 6
6 is a Perfect Number.



*/