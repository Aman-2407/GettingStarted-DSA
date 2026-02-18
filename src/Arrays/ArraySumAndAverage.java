package Arrays;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        int arr[] ={4,3,1,2};
        int sum=0;
        for (int i=0;i<=arr.length-1;i++){
           sum= sum+arr[i]   ;
        }
        System.out.println("Sum of given array is" +sum);

        double avg = (double)sum/arr.length;

        System.out.println("Average is" + avg);
    }
}
