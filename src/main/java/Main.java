// Main.java
// Anthony Hackman

import java.util.Scanner;

import SortMethods.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = { "23", "5", "88", "123", "94", "3", "2", "7" };

        // Display the original array
        System.out.println("Original array:");
        display(numbers);

        // Ask the user which sorting method to use
        System.out.println("\nWhich sorting method would you like to use?");
        System.out.println("1. Bubble Reverse Sort");
        System.out.println("2. Selection Reverse Sort");
        System.out.println("3. Merge Reverse Sort");
        System.out.println("4. Quick Reverse Sort");
        System.out.print("Enter number (1-4): ");
        int choice = scanner.nextInt();

        // Use the chosen sorting algorithm
        switch (choice) {
            case 1:
                BubbleReverseSort.bubbleReverseSort(numbers);
                break;
            case 2:
                SelectionReverseSort.selectionReverseSort(numbers);
                break;
            case 3:
                MergeReverseSort.mergeReverseSort(numbers);
                break;
            case 4:
                QuickReverseSort.quickReverseSort(numbers);
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                scanner.close();
                return;
        }

        // Display the sorted array
        System.out.println("\nSorted array:");
        display(numbers);

        scanner.close();
    }

    // Method to display the contents of the array
    public static void display(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println(); // Move to the next line after displaying the array
    }
}
