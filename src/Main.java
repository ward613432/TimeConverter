import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        double[] times = new double[4];

        // Get input
        System.out.println("Give me a certain amount of time in seconds.");
        do {
            if (scanner.hasNextDouble()) {
               times[0] = scanner.nextDouble();

               if (times[0] > 0) {
                   valid = true;
               } else {
                   System.out.println("You can't have negative seconds.");
               }
            } else {
                System.out.println("That input only allows numbers.");
            }
            scanner.nextLine(); // clear cache
        } while(!valid);
        valid = false; // reset validity

        // Calculate times
        times[1] = times[0] / 60;
        times[2] = times[1] / 60;
        times[3] = times[2] / 24;

        // Output times
        System.out.printf("Seconds: %.02f\n", times[0]);
        System.out.printf("Minutes: %.02f\n", times[1]);
        System.out.printf("Hours: %.02f\n", times[2]);
        System.out.printf("Days: %.02f", times[3]);
    }
}