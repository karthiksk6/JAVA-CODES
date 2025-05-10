import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    if (n < 20) {
      System.out.println("n is less than 20");
    }

    if (n % 2 == 0) {
      System.out.println("n is even");
    } else {
      System.out.println("n is odd");
    }

    sc.close();
  }
}
