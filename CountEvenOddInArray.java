public class CountEvenOddInArray{
    public static void main(String[] args) {
        int arr[] ={10,5,8,13,6};
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Even number : " +evenCount);
        System.out.println("Odd number : " +oddCount);

    }
}