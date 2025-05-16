import java.util.*;

public class SmallPostiveNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int SmallPostiveNum = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == SmallPostiveNum) {

                SmallPostiveNum++;
            }
        }
        System.out.println(SmallPostiveNum);
    }
}