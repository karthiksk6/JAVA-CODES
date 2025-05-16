import java.util.*;

public class Container {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = n - 1;
        int j = 0;
        while (j < i) {
            System.out.println(arr[i] + " " + arr[j]);
            i--;
            j++;
        }
        if (j == i) {
            System.out.println(arr[i] + " 0");
        }
    }
}