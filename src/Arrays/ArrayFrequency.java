package Arrays;

import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1,2,3,2,2,6,8,9};
        int count=0;
        int target=3;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target) count++;
        }
        System.out.println("Frequency of "+target+" is "+count);

        Arrays.sort(arr);
        int count1=0;
        for(int i=0;i<arr.length-1;i++){

            if(i<arr.length-1 && arr[i] == arr[i+1]){
                count1++;

}           else {
                if(arr[i] %2==0){
                    IO.println("Frequency of Even number in the array "+arr[i]+" is "+(count1));
                }
                else{
                    System.out.println("Frequency of Array element "+arr[i]+" is "+(count1));

                }

                count1=1;
            }
        }
    }
}
