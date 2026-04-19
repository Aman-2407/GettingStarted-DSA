package JavaApproach;

public class SlidingWindow {

     void main() {
        int users[] ={23,465,234,67,87,222,133,753,75};
        int days= 3;
        int sum=0;
        int average=0;
        for(int i=0;i<days;i++) {
            sum=sum + users[i];

        }
        average=sum/days;

         IO.println("Number of users and their avergae visited :" +average);

         for (int i = 1; i <=users.length-days ; i++) {
                sum=sum - users[i-1] + users[i + days-1];
                average=sum/days;
             IO.println("Number of users and their averge visited :" +average);
         }
    }
}


