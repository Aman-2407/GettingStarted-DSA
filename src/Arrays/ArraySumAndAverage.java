package Arrays;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        int arr[] ={4,3,1,2};
        int evenValuesum=0;
        int evenValuesCount=0;
        int evenIndexSum=0;
        int evenIndexCount=0;
        int sum=0;
        for (int i=0;i<=arr.length-1;i++){
            sum+=arr[i];
            if(arr[i]%2==0){
                evenValuesum= evenValuesum+arr[i]   ;
                evenValuesCount++;
            }
            if (i%2==0) {
                    evenIndexSum = evenIndexSum+arr[i] ;
                    evenIndexCount++;
            }


        }
        //Calculating Averages
        double avgVal = (arr.length > 0) ? (double) sum / arr.length : 0;
        double avgEvenVal = (evenValuesCount > 0) ? (double) evenValuesum / evenValuesCount : 0;
        double avgEvenIdx = (evenIndexCount > 0) ? (double) evenIndexSum / evenIndexCount : 0;
        System.out.println("Sum of Values: " + sum + " | Avg: " + avgVal);
        System.out.println("Sum of Even Values: " + evenValuesum + " | Avg: " + avgEvenVal);
        System.out.println("Sum of Even Indices: " + evenIndexSum + " | Avg: " + avgEvenIdx);

    }
}
