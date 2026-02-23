package LogicalQuestions;//Check prime with 1- 100 number

class checkPrimeNum {
    public void isPrime() {
        boolean isPrimes = false;

        for (int i = 2; i <= 100; i++) {
            isPrimes = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimes = false;
                    break;
                }
            }
            if (isPrimes) {
                System.out.println("Prime number between 1 to 100 are" + i + " ");
            }
        }
    }
}

public class CheckPrime {
    static void main(String[] args) {
        int num=13;
        if(num>0){
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num %i ==0){
                    System.out.println(num + "is not a Prime Number");
                    break;
                }
                else{
                    System.out.println(num + "is a Prime Number");
                }

            }
        }

    }
}
