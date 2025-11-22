import java.util.HashSet;

public class HashSetD {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2, 5, 1, 6};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {     
                // add() returns false → duplicate found
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
