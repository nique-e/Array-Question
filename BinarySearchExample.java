public class BinarySearchExample {

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;  // key found
            }
            else if (arr[mid] < key) {
                low = mid + 1;  // go to right half
            }
            else {
                high = mid - 1;  // go to left half
            }
        }
        return -1; // key not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int key = 40;

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
