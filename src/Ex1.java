import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        double x1, x2;

        System.out.println("Type first value: ");
        a = scanner.nextInt();

        System.out.println("Type second value: ");
        b = scanner.nextInt();

        System.out.println("Type third value: ");
        c = scanner.nextInt();

        x1 = ((-b + Math.sqrt(b*b - (4*a*c))) / (2*a));
        x2 = ((-b - Math.sqrt(b*b - (4*a*c))) / (2*a));

        if (Double.isNaN(x1) && Double.isNaN(x2)) {
            System.out.println("Resolve not exist");
        } else if (x1 != x2) {
            System.out.println("Founded two resolves: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Founded one resolve: ");
            System.out.println("x = " + x1);
        }
    }
}
