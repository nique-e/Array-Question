public class FindMaxMinIndex{
public static void main(String[] args) {
    

    int arr[] ={10,20,5,30,15};
    int maxIndex = 0;
    int minIndex = 0;

    for(int i = 1; i < arr.length; i++){
        if(arr[i] > arr[maxIndex]){
            maxIndex = i;
        }
        if(arr[i] < arr[minIndex]){
            minIndex = i;
        }
        
    }
  System.out.println("maximum element index :" +maxIndex);

   System.out.println("minimum element index :" +minIndex);

  System.out.println("maximum element value :" +arr[maxIndex]);

  System.out.println("maximum element value :" +arr[minIndex]);

   }
}