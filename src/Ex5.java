import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your number: ");
        int inputUser = scanner.nextInt();
        int firstFibNum = 0;
        int secondFibNum = 1;
        int currentFibNum = 0;

        System.out.println("Fibonachi's row: ");
        for (int i = 0; currentFibNum <= inputUser; i++) {
            currentFibNum = firstFibNum + secondFibNum;
            firstFibNum = secondFibNum;
            secondFibNum = currentFibNum;
            System.out.print(currentFibNum + " ");

            if (inputUser == currentFibNum) {
                System.out.println("This number is from Fibonachi's row");
                break;
            } else if (currentFibNum > inputUser) {
                System.out.println("This number is not from Fibonachi's row");
                break;
            }
        }
    }
}
