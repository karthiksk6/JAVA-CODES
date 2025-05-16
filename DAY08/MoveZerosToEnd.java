import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long num = sc.nextLong();
            int ones = 0, zeros = 0;
            long temp = num;

            while (temp > 0) {
                int digit = (int) (temp % 10);
                if (digit == 1)
                    ones++;
                else if (digit == 0)
                    zeros++;
                temp /= 10;
            }

            long result = 0;
            while (ones-- > 0)
                result = result * 10 + 1;
            while (zeros-- > 0)
                result = result * 10;

            System.out.println(result);
        }
        sc.close();
    }
}
