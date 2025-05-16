import java.util.Scanner;

public class CheckSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 2; // Bit position to check (0-based from right)

        if ((num & (1 << i)) != 0) {
            System.out.println("Bit at position " + i + " is set (1)");
        } else {
            System.out.println("Bit at position " + i + " is not set (0)");
        }

        sc.close();
    }
}
