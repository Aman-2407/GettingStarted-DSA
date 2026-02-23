package Arrays;

public class ArraysCopy {
    void main() {
        int[] arr = {23, 45, 67, 89, 44, 24, 12};
        int[] oddOnly = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) { // Check if the element is odd
                oddOnly[index] = arr[i]; // Store the odd element in the oddOnly array
                index++;// Increment the index for the oddOnly array
            }
        }
        int[] finalResult = java.util.Arrays.copyOf(oddOnly, index);
        System.out.println("Copy of Original Array with printing odd values " + java.util.Arrays.toString(finalResult));
        int[] arrcopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrcopy[i] = arr[i];
        }
        System.out.println("Original Array " + java.util.Arrays.toString(arr));
        System.out.println("Copy of Original Array " + java.util.Arrays.toString(arrcopy));


        int[] arrcopytemp = new int[arr.length];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arrcopytemp[n - 1 - i] = arr[i];
        }
        System.out.println("Copy of Original Array in new in reverse order " + java.util.Arrays.toString(arrcopytemp));
    }
    }

