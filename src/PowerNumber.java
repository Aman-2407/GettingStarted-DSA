public class PowerNumber {
    static void main(String[] args) {
        int num=5;
        int res=1;
        int base=2;

        for(int i=0;i<num;i++){
            res=res*base;
        }
        System.out.println(res);
    }
}
