package lk.ijse;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ar={9,5,1,4,3};
        int[] sortArrray=insertionsort(ar);
        System.out.println(Arrays.toString(sortArrray));
    }
    private static int[] insertionsort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {   // Iterate over unsorted elements
            int key = ar[i];  // Element to be inserted
            int j = i - 1;

            while (j >= 0 && ar[j] > key) {  // Shift elements to make space for key
                ar[j + 1] = ar[j];
                j = j - 1;
            }

            ar[j + 1] = key;  // Insert key at the correct position
        }
        return ar;  // Return sorted array
    }

}
