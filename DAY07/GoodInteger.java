import java.util.Scanner;

public class GoodInteger {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int x = 1;
            int y = (int) Math.cbrt(arr[i]);
            while (x <= y) {
                int z = (int) (Math.pow(x, 3) + Math.pow(y, 3));
                if (z == arr[i]) {
                    count++;
                    break;
                } else {
                    if (z < arr[i]) {
                        x++;
                    } else {
                        y--;
                    }
                }
            }
        }
        System.out.println(count);
    }
}