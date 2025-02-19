import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        Map<Integer, Integer> occurrences = new HashMap<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }

        System.out.println("Number of occurrences of each element:");
        occurrences.forEach((number, count) -> System.out.println(number + ": " + count));
    }
}
