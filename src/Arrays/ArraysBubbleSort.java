public class ArraysBubbleSort {
    public int bubbleSortIntegre(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            boolean isSwap = false;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
        return 0;
    }

    public void bubbleSortString(String arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            boolean isSwap = false;
            for (int j = 0; j < n - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }
}

 void main(String[] args) {
     int arr[] = {4, 3, 1, 2};
     ArraysBubbleSort bubbleSort = new ArraysBubbleSort();
     bubbleSort.bubbleSortIntegre(arr);

     for (int no : arr) {
         System.out.println(no);
     }
     String str[] = {"Banana", "Apple", "Mango", "Grapes"};
     bubbleSort.bubbleSortString(str);
     for (String s : str) {
         System.out.println(s);
     }
 }
