public class BubbleSortExample{
    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 1, 3};
        int n = arr.length;

        // ---------- Ascending Order ----------
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Ascending Order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // ---------- Descending Order ----------
        // (Same array ko dobara sort karne ke liye pehle reverse karna)
        int arr2[] = {5, 2, 8, 1, 3};
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr2[j] < arr2[j + 1]) {
                    // Swap elements
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.print("Descending Order: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
