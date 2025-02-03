// Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20]

// logic :


public class ArraySort {
    public static void main(String[] args) {
        // Given array of integers
        int[] arr = {45, 35, 56, 67, 78, 89, 78, 12, 20};

        // Sorting the array using Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing the sorted array 
        System.out.print("Sorted Array in Ascending Order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}


/*output :

Sorted Array in Ascending Order: 12, 20, 35, 45, 56, 67, 78, 78, 89


*/