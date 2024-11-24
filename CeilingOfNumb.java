package BinarySearch;
//Ceiling of number is number which is smallest element in array greater than or equal target element 


public class CeilingOfNumb {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 33;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }

    static int Ceiling(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;
        // To check ascending order or descending order
        boolean IsAsc = arr[start] < arr[end];

        while (start <= end) {
            // find mid element
            // int mid = (start+end)/2;
            int mid = start + (end - start) / 2;
            if (target > end) {
                return -1;
            }

            if (arr[mid] == target) {
                return mid;
            }
            if (IsAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return start;

    }
}
