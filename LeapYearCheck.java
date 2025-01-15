//Write a program to check leap year using if else. How to check whether a given year is a leap year or not


// logic:

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        // Scanner object created 
        Scanner sc = new Scanner(System.in);

        // enter a year 
        System.out.print("Enter a year to check if it's a leap year: ");
        int year = sc.nextInt();

        // Check if the year is a leap year
        if (year % 4 == 0)
        {
            System.out.println(year + " is a leap year.");
        }
        else 
        {
            System.out.println(year + " is not a leap year.");
        }
    }
}



// output:

Enter a year to check if it's a leap year: 2024
2024 is a leap year.

