public class RearrangePosNegAlt {

    public static void rearrange(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Even index -> Positive expected
            if (i % 2 == 0 && arr[i] < 0) {
                int j = i + 1;
                while (j < n && arr[j] < 0) j++;
                if (j == n) break;
                rightRotate(arr, i, j);
            }
            // Odd index -> Negative expected
            else if (i % 2 == 1 && arr[i] >= 0) {
                int j = i + 1;
                while (j < n && arr[j] >= 0) j++;
                if (j == n) break;
                rightRotate(arr, i, j);
            }
        }
    }

    // Right rotate helper
    private static void rightRotate(int[] arr, int start, int end) {
        int temp = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -5, 6};

        rearrange(arr);

        for (int x : arr) System.out.print(x + " ");
    }
}
