package Arrays;

import java.util.Arrays;

public class ArrayInsertionSort {

    public int [] arrayInsertionSortIntegre(int [] array){
        int temp;
        for(int i = 1; i < array.length; i++){
            temp = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        return array;
    }

    public String[] arrayInsertionStringSort(String [] array){
        String temp;
        for(int i = 1; i < array.length; i++){
            temp = array[i];
            int j = i-1;
            while(j >= 0 && array[j].compareTo(temp) > 0){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        return array;
    }

}

class ArrayInsertionSortTest{
    public static void main(String[] args) {
        ArrayInsertionSort a = new ArrayInsertionSort();
        int [] array = {1,23,3,46,5,665,77,62,92,10};
        IO.println("Before Sorting: " + Arrays.toString(array));
        a.arrayInsertionSortIntegre(array);
        IO.println("After sorting:" + Arrays.toString(array));

        String [] arr ={"Zubir", "Kariosh","Aakansha","Aman","Kajal","Vinayak"};

        IO.println("Before Sorting: " + Arrays.toString(arr));

        a.arrayInsertionStringSort(arr);
        IO.println("After sorting:" + Arrays.toString(arr));


    }
}