package Arrays;


import java.util.Arrays;

class ArrayIndexInsert {

    public int[] arrayinsert(int arr[], int index, int new_element) {


        //insertion of array
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];

        }

        newArr[index] = new_element;

        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public int[] arrayDelete(int arr[] , int index){
        int newArr[] = new int[arr.length - 1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        return  newArr;
    }
    public int[] arraySearch(int arrr[], int element, boolean found) {
        for (int i = 0; i < arrr.length; i++) {
            if (arrr[i] == element) {
                found = true;
                System.out.println("Element is found at index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Element is not found in the array");
        }
        return  arrr;
    }

    public int[] arrayUpdate(int arr[], int index, int new_element){
        if(index>=0 && index<arr.length){
            arr[index] = new_element;
        }
        return arr;
    }
}
    public class ArrayInsertion {
        public static void main(String[] args) {
            ArrayIndexInsert a = new ArrayIndexInsert();
            int[] result = a.arrayinsert(new int[]{34, 45, 56, 67}, 2, 100);
            int[] result1=a.arrayDelete(new int[]{34, 45, 56, 67}, 2);
            System.out.println("Array after Insertion: " + java.util.Arrays.toString(result));
            System.out.println("Array after Deletion:  " + java.util.Arrays.toString(result1));
            int[] foundIndex = a.arraySearch(new int[]{12, 340, 86, 23}, 340, false);
            int[] updatedArr = a.arrayUpdate(new int[]{34, 45, 56, 67}, 1, 100);
            System.out.println("Array after Update: " + java.util.Arrays.toString(updatedArr));
        }
    }

