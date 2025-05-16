import java.util.Scanner;

public class IntegerNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] result = new int[num];
        int start = 0;
        int end = num - 1;

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            if (arr[i] % 2 != 0) {
                result[start++] = arr[i];
            } else {
                result[end--] = arr[i];
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}