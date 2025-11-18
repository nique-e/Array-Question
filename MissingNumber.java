public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5}; // 3 missing hai
        int n = 5;

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }

        int total = n * (n + 1) / 2;
        int missing = total - sum;

        System.out.println("Missing number is: " + missing);
    }
}
