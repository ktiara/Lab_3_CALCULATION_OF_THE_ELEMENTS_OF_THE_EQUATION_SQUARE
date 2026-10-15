import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The program calculates the roots of the equation ax^2+bx+c = 0.");

        System.out.println("Enter the value of a (and press Enter):");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Error: 'a' cannot be zero.");
            return;
        }

        System.out.println("Enter the value of b (and press Enter):");
        double b = scanner.nextDouble();

        System.out.println("Enter the value of c (and press Enter):");
        double c = scanner.nextDouble();

        System.out.printf("For a = %.2f, b = %.2f, c = %.2f.\n", a, b, c);

        double delta = (b * b) - (4 * a * c);
        int rootsCount = 0;

        if (delta > 0) {
            rootsCount = 2;
        } else if (delta == 0) {
            rootsCount = 1;
        }

        switch (rootsCount) {
            case 2:
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf(" x1 = %.2f.\n", x1);
                System.out.printf(" x2 = %.2f.\n", x2);
                break;
            case 1:
                double x = -b / (2 * a);
                System.out.printf(" x1 = %.2f.\n", x);
                break;
            case 0:
                System.out.println(" No real roots.");
                break;
        }

        scanner.close();
    }
}