
public class Ex7 {
    public static void main(String[] args) {

        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int number;
        int example;
        int armrstrongNum;
        System.out.print("The armstrong numbers is: ");

        for (number = 100; number <= 1000; number++) {
            example = number;
            firstDigit = example % 10;
            example/=10;
            secondDigit = example % 10;
            example/=10;
            thirdDigit = example % 10;

            armrstrongNum = (firstDigit * firstDigit * firstDigit) + (secondDigit * secondDigit * secondDigit) + (thirdDigit * thirdDigit * thirdDigit);

            if (armrstrongNum == number) {
                System.out.print(armrstrongNum + " ");
            }
        }
    }
}
