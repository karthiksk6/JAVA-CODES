import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 180, 200, 180, 180, 200, 200, 200, 200 };
        int max_height = 0;
        int max_height_person = 0;

        int max_weight = 0;
        int max_weight_person = 0;

        for (int i = 0; i < arr.length; i += 2) {
            int personIndex = (i / 2) + 1;
            int height = arr[i];
            int weight = arr[i + 1];

            if (height > max_height) {
                max_height = height;
                max_height_person = personIndex;
            }

            if (weight > max_weight) {
                max_weight = weight;
                max_weight_person = personIndex;
            }
        }
        System.out.println(max_height_person);
        System.out.println(max_weight_person);
    }
}