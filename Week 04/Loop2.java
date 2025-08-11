import java.util.Scanner;

public class EvenNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept input from the user
        /* First input will be the starting number
        Second input will be the ending number */
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("\nEven numbers from " + start + " to " + end + ":");

        // Loop through the range
        for (int i = start; i <= end; ++i) {
            if (i % 2 == 0) { // Check if number is even
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
