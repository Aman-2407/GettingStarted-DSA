package Arrays;

import java.util.Arrays;

public class ArraySelectionSort {

    public  int[] selectionsort(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n-1 ; i++) {
            int min=i;
            for (int j = i + 1; j < n; j++) {
                if(arr[min]> arr[j]){
                    min=j;
                }

            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
return arr;
    }

    public void SelectionSortString(String arrString[]){
        int n = arrString.length;

        for (int i = 0; i < n-1 ; i++) {
            int min=i;
            for (int j = i + 1; j < n; j++) {
                if(arrString[min].compareTo(arrString[j])>0){
                    min=j;
                }

            }
            String temp= arrString[min];
            arrString[min]= arrString[i];
            arrString[i]=temp;
        }
    }

}


class Solution{
    public static void main(String[] args) {
        ArraySelectionSort obj=new ArraySelectionSort();
        int[] arr={23,46,25,56,75,2,54,41,12,33};
        IO.println("Unsorted Array : " + Arrays.toString(arr));
        obj.selectionsort(arr);
        IO.println("Sorted Array : " + Arrays.toString(arr));

        String [] arr1={"KAJAL","ZUBER","Akash","Deep","Vicky","Gabriel","Mana"};
        IO.println("Unsorted Array : " + Arrays.toString(arr1));
        obj.SelectionSortString(arr1);
        IO.println("Sorted Array : " + Arrays.toString(arr1));
    }
}