package BinarySearch;
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 23, 45, 66, 622222661, 777722222 };
        int target = 622222661;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int OrderAgnosticBS(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        //To check ascending order or descending order
        boolean IsAsc = arr[start] < arr[end];

        while (start <= end) {
            //find mid element
            // int mid = (start+end)/2;
            int mid = start + (end - start) / 2;

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
        return -1;

    }
}
