package LogicalQuestions;

public class FibonacciSeries {
    static void main(String[] args) {
        int a=0;
        int b=1;
        int n=8;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <n ; i++) {
            int next = a+b;
            System.out.print(next + " ");
            a=b;
            b=next;

        }
    }
}
