public class MedianTwoArrays {

    public static double findMedianSortedArrays(int[] A, int[] B) {
        if (A.length > B.length) return findMedianSortedArrays(B, A);

        int n = A.length, m = B.length;
        int total = n + m;
        int half = total / 2;

        int l = 0, r = n - 1;

        while (true) {
            int i = (l + r) / 2;
            int j = half - i - 2;

            double Aleft  = (i >= 0) ? A[i] : Double.NEGATIVE_INFINITY;
            double Aright = (i + 1 < n) ? A[i + 1] : Double.POSITIVE_INFINITY;

            double Bleft  = (j >= 0) ? B[j] : Double.NEGATIVE_INFINITY;
            double Bright = (j + 1 < m) ? B[j + 1] : Double.POSITIVE_INFINITY;

            if (Aleft <= Bright && Bleft <= Aright) {
                // Correct partition
                if (total % 2 == 1) {
                    return Math.min(Aright, Bright);
                }
                return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
            } 
            else if (Aleft > Bright) {
                r = i - 1;
            } 
            else {
                l = i + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 8};
        int[] arr2 = {7, 9, 10, 11};

        double median = findMedianSortedArrays(arr1, arr2);
        System.out.println("Median: " + median);
    }
}
