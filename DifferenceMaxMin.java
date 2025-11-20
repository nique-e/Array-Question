public class DifferenceMaxMin {
    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 1, 9};

        int max = arr[0];
        int min = arr[0];

        // Find max and min
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        int difference = max - min;

        System.out.println("Max Element = " + max);
        System.out.println("Min Element = " + min);
        System.out.println("Difference = " + difference);
    }
}
