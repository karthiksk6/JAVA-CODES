import java.util.Scanner;

public class evenAndOddSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int even = 0, odd = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                even = even + arr[i];
            else
                odd = odd + arr[i];
        }
        System.out.println("Even Sum: " + even);
        System.out.println("Odd Sum: " + odd);
        sc.close();
    }
}
