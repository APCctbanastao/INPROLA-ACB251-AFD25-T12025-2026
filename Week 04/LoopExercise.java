import java.util.Scanner;

class LoopExercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Accept input from the user
        /* First input will be the starting number
        Second input will be the ending number */
        System.out.print("Enter the starting number: ");
        int start = s.nextInt();

        System.out.print("Enter the ending number: ");
        int end = s.nextInt();
        
        //Added a print line to show the even numbers from the first input to the second input
        System.out.println("\nEven numbers from " + start + " to " + end + ":");

        // Loop through the range
        for (int i = start; i <= end; ++i) {
            if (i % 2 == 0) { // Checks if number is even
                System.out.print(i + " ");
            }
        }

        s.close();
    }
}
