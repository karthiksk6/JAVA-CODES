import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            for (int j = num - 1; j > i; j--) {
                if (arr[j] % 2 == 0 && arr[i] % 2 != 0) {

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int k = 0; k < num; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}