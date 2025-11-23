public class ZigZagArray {
    public static void rearrange(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                // Even index: arr[i] < arr[i+1]
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                // Odd index: arr[i] > arr[i+1]
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 5};
        rearrange(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
