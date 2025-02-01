import java.util.Scanner;

public class prime{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int limit = input.nextInt();

        System.out.println("Prime numbers up to " + limit + " are:");

        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;

            // Optimized divisibility check: only up to the square root of num
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
