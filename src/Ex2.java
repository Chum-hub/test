import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base_number, step_number, amount_number;
        int step;

        System.out.print("Type your base number: ");
        base_number = scanner.nextInt();

        System.out.print("Type your step number: ");
        step_number = scanner.nextInt();

        do {
            System.out.print("Type your (positive) amount number: ");
            amount_number = scanner.nextInt();
        } while (amount_number < 0);

        step = base_number;

        for (int i = 0; i < amount_number; i++ ) {
            if (step == base_number){
                System.out.print("Your subsequence: " + step + " ");
                step += step_number;
            } else {
                step += step_number;
                System.out.print(step + " ");
            }
        }
    }
}

