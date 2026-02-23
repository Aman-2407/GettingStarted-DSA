package Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {
        int arr[]={34,44,94,64};
        int min=arr[0];
        int max= arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]> max){
                max=arr[i];
            } else if (arr[i]< min) {
                min=arr[i];
            }
        }
        System.out.println("Minimum and maximum number from the given array are " + min + " and " +max);
    }
}
