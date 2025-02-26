package lk.ijse;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("killer");
        int[] arr = {11, 17, 18, 45, 50, 71, 95};  // Sorted array
        int target = 17;  // Number to search
        int result = searchNumber(arr, target);  // Call binary search function

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    // Binary search function
    private static int searchNumber(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {  // Continue searching while left ≤ right
            int mid = left + (right - left) / 2;  // Find middle index

            if (arr[mid] == target) {  // If middle element is the target
                return mid;  // Return index of found element
            }

            if (arr[mid] < target) {  // If target is greater, search right half
                left = mid + 1;
            } else {  // If target is smaller, search left half
                right = mid - 1;
            }
        }
        return -1;  // Target not found
    }
}
