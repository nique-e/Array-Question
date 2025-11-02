public class LargestSmallestInArray{
    public static void main(String[] args) {
        int arr [] = {10,2,5,15,3};
        int largest = arr[0];
        int smallest =arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]< smallest ){
                smallest = arr[i];
            }
            if(arr[i] > largest){
                largest = arr[i];   
            }
        }

        System.out.println("largest element : " +largest);
        System.out.println("smallest element : " +smallest);
    }
}