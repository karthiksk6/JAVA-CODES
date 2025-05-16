import java.util.Scanner;

public class insertionarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be inserted");
        int x = sc.nextInt();

        System.out.println("Enter the position at which to insert the element (0 to " + n + ")");
        int pos = sc.nextInt();

        if (pos < 0 || pos > n) {
            System.out.println("Invalid position.");
            return;
        }

        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = x;
        n++;

        System.out.println("The array after insertion is");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
