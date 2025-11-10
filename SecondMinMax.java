public class SecondMinMax{

    public static void main(String[] args) {
        int arr[] = {10,5,8,20,2,15};

        int smallest = arr[0];
        int largest = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest =arr[i];

            }
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

         int secondSmallest = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }

            if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
         System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);
        System.out.println("Largest element: " + largest);
        System.out.println("Second largest element: " + secondLargest);
    }
}