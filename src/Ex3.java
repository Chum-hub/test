import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            num = scanner.nextInt();
        } while (num <= 3 || num % 2 == 0);

        int emptyStep = (num - 1) / 2;
        int amountOfStars = 1;
        int minEmpt = 0;

        for (int i = 0; i < (num + 1) / 2; i++) {
            for (int j = emptyStep - i; j >= 0; j--) {
                System.out.print(" ");
                minEmpt = j + 1;
            }
            for (int k = 0; k < amountOfStars; k++) {
                System.out.print("*");
            }
            amountOfStars += 2;
            System.out.println();
        }
        emptyStep = minEmpt + 1;
        amountOfStars -= 2;
        for (int i = 1; i <= (num - 1) / 2; i++) {
            amountOfStars -= 2;
            for (int j = 0; j < emptyStep; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < amountOfStars; k++) {
                System.out.print("*");
            }
            emptyStep += 1;
            System.out.println();
        }

    }
}
