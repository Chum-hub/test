import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            num = scanner.nextInt();
        } while (num <= 3 | num % 2 == 0);
        int emptyStep = (num-1)/2;
        int amountOfStars = 1;
        for (int i = 0; i < num; i++){
            for (int j = emptyStep-i; j >= 0; j--) {
                System.out.print(" ");
                if (j == 0){
                    for (int k = 0; k < amountOfStars; k++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
            amountOfStars+=2;
        }
    }
}
