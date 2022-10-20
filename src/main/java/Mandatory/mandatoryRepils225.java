package Mandatory;

public class mandatoryRepils225 {
    //reverse a numbers
    static int reverse(int x){
        int rev=0;
        int rem;
        while (x>0){
            rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }
        return rev;
    }
    public static void main(String[] args) {
       // int x=123;
        int x=12345;
       // int x=1001;
       // int x789
        System.out.println("the reverse of this int is  " +reverse(x));
    }
}
