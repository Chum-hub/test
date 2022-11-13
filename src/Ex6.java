import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your number: ");

        int inputUser = scanner.nextInt();
        int sumOfDigits = 0;
        int length = (int) (Math.log10(inputUser) + 1);

        for (int i = 0; i < length ;i++) {
            sumOfDigits += inputUser % 10;
            inputUser /= 10;
        }
        System.out.println("Sum of digits: " + sumOfDigits);
    }
}
