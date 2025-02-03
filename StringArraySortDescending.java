// Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B]

// logic :


public class StringArraySortDescending {
    public static void main(String[] args) {
        // Given array of strings
        String[] letters = {"A", "X", "D", "Z", "Y", "C", "W", "B"};

        // Printing the original array before sorting
        System.out.println("Original array: ");
        for (String letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();

        // Sorting the array in descending order using Bubble Sort
        for (int i = 0; i < letters.length - 1; i++) {
            for (int j = 0; j < letters.length - i - 1; j++) {
                // Compare adjacent elements and swap if necessary for descending order
                if (letters[j].compareTo(letters[j + 1]) < 0) {
                    // Swap letters[j] and letters[j + 1]
                    String temp = letters[j];
                    letters[j] = letters[j + 1];
                    letters[j + 1] = temp;
                }
            }
        }

        // Printing the sorted array in descending order
        System.out.println("Sorted array in descending order: ");
        for (String letter : letters) {
            System.out.print(letter + " ");
        }
    }
}

/* output:


Original array: 
A X D Z Y C W B 
Sorted array in descending order: 
Z Y X W D C B A 




*/