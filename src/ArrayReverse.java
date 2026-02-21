public class ArrayReverse {
    public static void main(String[] args) {


        int arr[] = {34, 45, 56, 67, 78};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        System.out.println(java.util.Arrays.toString(arr));
    }


}
