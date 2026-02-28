package Arrays;


import java.util.Arrays;

public class ArrayBinarySearch {
    void main() {
        int arr[] = {23, 34, 53, 12, 78, 45, 23};
        int first_element = 0;
        int last_element = arr.length - 1;
        int value=23;
        boolean found = false;
        Arrays.sort(arr);
        IO.println("Sorted Array is "+ Arrays.toString(arr));
        while (first_element <= last_element) {
            int middle_element = first_element + (last_element- first_element) / 2; // Dividing the array
            if (arr[middle_element] == value) {
                IO.println("Array found at index " + middle_element);
                found = true;
                break;
            }
            if(value > arr[middle_element]) {
                first_element = middle_element + 1;
            }
            else{
                last_element = middle_element-1;
            }
        }
if(!found){
    IO.println("Value is not present inside given Array ");
}

    }
}