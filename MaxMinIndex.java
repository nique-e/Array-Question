import java.util.Scanner;

public class MaxMinIndex {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize with first element
        int max = arr[0], min = arr[0];
        int maxIndex = 0, minIndex = 0;

        // Loop to find max and min index
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        // Display results
         System.out.println("Maximum element: " + max + " found at index " + maxIndex);
        System.out.println("Minimum element: " + min + " found at index " + minIndex);

        sc.close();
    }
    }