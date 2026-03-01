package Arrays;


import java.util.Arrays;

class BinarySearchUtiltiy{
    public int binarySearch(int[] arr, int value){
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while(low<=high){
            mid = low +(high-low)/2;
            if(arr[mid] == value){
                return mid;
            }
            if(arr[mid] > value){
                high = mid-1;
            }
            else if(arr[mid] < value){
                low = mid+1;
            }
        }
        return mid;
    }
    public int binarySearchFirstandLastOcc(int[] arr, int key, boolean isFirst){
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int result = -1;
        while(low<=high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                result = mid;
                if (isFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public int findCeiling(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while(low<=high){
            mid = low + (high-low)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(key > arr[mid]){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return (low<arr.length)?low:-1;
    }
   
}

public class ArrayBinarySearch {
    void main() {
        int[] arr= {45,34,23,56,45,67,23};
        Arrays.sort(arr);
        int key=45;
        BinarySearchUtiltiy obj = new BinarySearchUtiltiy();

        IO.println("Sorted Array : " + Arrays.toString(arr));
        IO.println("Searching for key : " + key);
        int value= obj.binarySearch(arr, key);
        IO.println("Element found at index : "+value);
        int first = obj.binarySearchFirstandLastOcc(arr,key,true);
        IO.println("First Occurrence of the Element "+key + " is : "+first);
        int last = obj.binarySearchFirstandLastOcc(arr,key,false);
        IO.println("Last Occurrence of the Element "+key+" is : "+last);
        if(first ==-1){
            IO.println("Count is 0");
        }
        else {
            int total= (last-first)+1;
            IO.println("Count of the key "+key+ " is "+total);
        }
        int celi= obj.findCeiling(arr,key);
        IO.println("Ceiling Element found at index : "+celi);
     
        

}

    }
