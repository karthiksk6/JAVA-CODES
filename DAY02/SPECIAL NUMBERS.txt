import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int m = new Scanner(System.in).nextInt(), 
        n = new Scanner(System.in).nextInt();
        for (int i = m; i <= n; i++) {
            int a = i / 10, b = i % 10;
             if (a + b + a * b == i) System.out.println(i);
        }
  }
}
            
    
             