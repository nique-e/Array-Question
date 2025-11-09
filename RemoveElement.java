public class RemoveElement{

    public static void main(String[] args) {
        int arr[] ={10,20,30,30,50,20};
        int n = arr.length;

        int j = 0;

        for(int i = 0; i< n-1; i++){
            if(arr[i] != arr[i + 1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        System.out.println("array after removing dulicates :");

         for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}