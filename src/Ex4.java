import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputUser;
        int simpleCounter = 0;
        int numberCounter = 0;
        int simpleNumber = 0;
        boolean isSolved = false;

        do {
            System.out.println("Type positive number: ");
            inputUser = scanner.nextInt();
        } while (inputUser < 1);

        System.out.print("Simple numbers: ");
        for (int i = 2; !isSolved; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    simpleCounter++;
                }
            }
            if (simpleCounter == 2) {
                numberCounter++;
                simpleNumber = i;
                System.out.print(simpleNumber + " ");
            }
            simpleCounter = 0;
            if (numberCounter == inputUser) {
                isSolved = true;
            }
        }
    }
}
