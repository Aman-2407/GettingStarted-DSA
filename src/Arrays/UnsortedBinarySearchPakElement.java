package Arrays;

public class UnsortedBinarySearchPakElement {
    public int findPeak(int arr[], int low, int high) {

        if (arr == null || arr.length == 0) {
            return -1;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return arr[low];
    }

    public int findRoatatedPeak(int arr[], int low, int high, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }


        }
        return -1;
    }

    public int findSQRTInteger(int num){
       if(num<0){
              return -1;
       }
       if(num==0 || num==1){
              return num;
       }
         int low = 1;
            int high = num;
            int result = 0;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                long sqrt = (long) (mid * mid);
                if(sqrt == num){
                    return mid;
                }
                else if (sqrt > num){
                    high = mid - 1;
                }
                    else {
                        low = mid + 1;
                        result = mid;
                    }

    }
return result;
}

void main(String[] args) {
    UnsortedBinarySearchPakElement obj = new UnsortedBinarySearchPakElement();
    int arr[] = {110, 190, 20, 290, 80, 370};
    int low = 0;
    int high = arr.length - 1;
    int peak = obj.findPeak(arr, low, high);
    System.out.println("Peak element in the given array is " + peak);

    int target = 80;
    int rotatedPeak = obj.findRoatatedPeak(arr, low, high, target);
    System.out.println(" Element " + target + " in the given rotated array is at index " + rotatedPeak);

    int num = 16;
    int sqrt = obj.findSQRTInteger(num);
    System.out.println("Square root of " + num + " is " + sqrt);
}
}
