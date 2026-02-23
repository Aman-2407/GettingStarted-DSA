package Arrays;

public class ArrayReverse {
    public static void main(String[] args) {


        int arr[] = {34, 45, 56, 67, 78}; //Original Array
        int arrcopy[] = new int[arr.length];  // Copying original array to another array to preserve the original array
        for (int i = 0; i < arr.length; i++) {
            arrcopy[i] = arr[i];
        }
        int left = 0;
        int right = arr.length - 1;
        int[] arrcopytemp = null;
        while (left < right) {
            int temp = arr[left];// Swapping elements at left and right indices
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
           arrcopytemp = new int[arr.length]; // Copying the reversed array to another array to preserve the reversed array
            for (int i = 0; i < arr.length; i++) {
                arrcopytemp[i] = arr[i];
            }
        }
        System.out.println("Original Array " + java.util.Arrays.toString(arrcopy));
        System.out.println("Reverse Array " + java.util.Arrays.toString(arr));
        System.out.println("Reverse Array stored in copy array " + java.util.Arrays.toString(arrcopytemp));


    }


}
