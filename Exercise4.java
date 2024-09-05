import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        int count = 0;
        int digit;

        System.out.println("Enter numbers (enter -999 to stop):");

        while (true) {
            digit = scanner.nextInt();

            if (digit == -999) {
                break;
            }

            sum += digit;
            count++;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("Sum: %.2f%n", sum);
            System.out.printf("Average: %.2f%n", average);
        }

        scanner.close();
    }
}

