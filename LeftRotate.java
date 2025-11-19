public class LeftRotate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = 1; // rotate by 1

        for(int i=0; i<n; i++){
            int first = arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first;
        }

        // Print array
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
