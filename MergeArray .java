 public class MergeArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};

        int merged[] = new int[a.length + b.length];

        int index = 0;

        // Copy array a
        for(int i = 0; i < a.length; i++){
            merged[index++] = a[i];
        }

        // Copy array b
        for(int i = 0; i < b.length; i++){
            merged[index++] = b[i];
        }

        // Print merged array
        for(int i = 0; i < merged.length; i++){
            System.out.print(merged[i] + " ");
        }
    }
}
