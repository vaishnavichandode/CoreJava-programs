// Write java program to check  candidate eligible for voting or not


// logic :

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Scanner object created 
        Scanner sc = new Scanner(System.in);

        //  enter  age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Check if the candidate is eligible for voting
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}


// output:

Enter your age: 20
You are eligible to vote.

Enter your age: 17
You are not eligible to vote.

