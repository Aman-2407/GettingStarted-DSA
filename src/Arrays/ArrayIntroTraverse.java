package Arrays;

public class ArrayIntroTraverse {
    public static void main(String[] args) {

        int [] arr = {23,354,454};


        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        for ( int no: arr){
            System.out.println(no);
        }

    }
}
