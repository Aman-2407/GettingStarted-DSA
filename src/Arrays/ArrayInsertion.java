package Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        int arr []= {23,45,566,28,56,67};
        int index= 4;
        int new_element= 450;

        int newArr[] = new int[arr.length+1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
            newArr[index]= new_element;
        }

        for (int i = index; i <arr.length ; i++) {
            newArr[i+1]= arr[i];
        }

    }
}
