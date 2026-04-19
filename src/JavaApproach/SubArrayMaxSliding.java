package JavaApproach;

public class SubArrayMaxSliding {
    void main() {
        int arr[] = {23,465,234,67,87,222,133,753,75};
        int k = 3;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            sum=sum +arr[i];

        }
        max = sum;
        for (int i = 1; i <=arr.length-k ; i++) {
            sum = sum - arr[i-1] + arr[i+k -1];
            if(sum>max){
                max = sum;

            }
        }
        IO.println(max);
    }
}
