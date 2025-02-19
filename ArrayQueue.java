// 2..Write a program using ArrayDeque to add book names and add,delete the values from both ends of que.


// logic:

import java.util.ArrayDeque;

public class ArrayQueue {
    public static void main(String[] args) {
        // Creating an ArrayDeque to store book names
        ArrayDeque<String> books = new ArrayDeque<>();

        // Adding books from both ends
        books.addFirst("Atomic Habits");
        books.addLast("Deep Work");
        books.addFirst("1984");
        books.addLast("Mindset");

        // Display the books
        System.out.println("Books in Queue: " + books);

        // Removing from both ends
        String removedFirst = books.removeFirst();
        System.out.println("Removed from front: " + removedFirst);

        String removedLast = books.removeLast();
        System.out.println("Removed from end: " + removedLast);

        // Display the updated books
        System.out.println("Updated Books in Queue: " + books);
    }
}


/*
output:

Books in Queue: [1984,Atomic Habits, Deep Work,Mindset]
Removed from front: 1984
Removed from end: Mindset
Updated Books in Queue: [Atomic Habits, Deep Work]



*/