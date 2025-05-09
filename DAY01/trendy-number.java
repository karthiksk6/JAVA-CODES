import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if (num >= 100 && num <= 999) {
      int middle = (num / 10) % 10;
      
      if (middle % 3 == 0) {
        System.out.println("Trendy number");
      } else {
        System.out.println("Not a trendy number");
      }
    } else {
      System.out.println("Enter a 3-digit number");
    }

    sc.close();
  }
}
