public class BinToInt {
    public static void main(String[] args) {
        int n = 1011;
        int rev = 0;
        int place = 1;
        while (n != 0) {
            int rem = n % 10;
            rev = rev + rem * place;
            place = place * 2;
            n /= 10;
        }
        System.out.println(rev);
    }
}