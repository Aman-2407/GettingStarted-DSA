package JavaApproach;

public class KadaneMaximumSubArray {
    public static void main(String[] args) {
        int arr [] ={23,-4,6,12,53,-7};
        int currentsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            currentsum+=arr[i];

            if(currentsum>max) {
                max=currentsum;
            }
            if(currentsum<0) {
                currentsum=0;
            }
        }

        IO.println(max);
    }
}
