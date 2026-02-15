 class primeCheck{
    public void sieve(int n){
        boolean [] isPrime = new boolean[n+1];
        for( int i=0 ;i<=n;i++)
            isPrime[i] = true;
        isPrime[0] = isPrime[1] = false;

       for(int j=2;j *j <=n;j++){
           if(isPrime[j]){
               for(int i=j*j;i<=n;i+=j)
                   isPrime[i]=false;

           }
       }
       for(int i =2;i<=n;i++){
           if(isPrime[i])
               System.out.println(i +" ");
       }
    }
}



public class PrimeUsingSieveofEratosthenes {
    public static void main(String[] args) {
        primeCheck primeCheck = new primeCheck();
        primeCheck.sieve(75);
    }
}
