class Palindrome{

    public void isPalindrome(int num) {
     int original=0;
      original = num;
      int reverse=0;
      while(num>0){
          int digit = num %10;
          reverse = reverse* 10+ digit;
          num=num/10;
      }
      if(reverse == original){
          System.out.println(reverse + "is a Palindrome Number");
      }
      else {
          System.out.println(reverse + "is not a Palindrome Number");

      }


    }
}








public class ReverseNumber {

    static void main(String[] args) {
        int n=12345;
        int rev=0;

        while (n!=0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reverse number is" +rev);

        Palindrome p = new Palindrome();
        p.isPalindrome(143);
    }
//
}
