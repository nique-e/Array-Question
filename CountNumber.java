
import java.util.Scanner;

public class CountNumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter " + size + "elements: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();

        }

         int positive = 0, negative = 0, zero = 0;

        // Loop to count numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        // Display results
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zero numbers: " + zero);

        sc.close();
    }
}