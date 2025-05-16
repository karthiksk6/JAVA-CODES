import java.util.Scanner;

public class IntToBin {
    public static void main(String[] args) {
        int n = 11;
        int rev = 0;
        int place = 1;
        while (n != 0) {
            int rem = n % 2;
            rev = rev + rem * place;
            place = place * 10;
            n /= 2;
        }
        System.out.println(rev);
    }
}
