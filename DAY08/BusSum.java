import java.util.Scanner;

public class BusSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] groups = new int[n];
        for (int i = 0; i < n; i++) {
            groups[i] = sc.nextInt();
        }
        int busCount = 1;
        int currentLoad = 0;
        for (int i = 0; i < n; i++) {
            if (currentLoad + groups[i] <= m) {
                currentLoad += groups[i];
            } else {
                busCount++;
                currentLoad = groups[i];
            }
        }
        System.out.println(busCount);
        sc.close();
    }
}
