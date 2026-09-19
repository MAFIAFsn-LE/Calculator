import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("   Welcome to the console calculator   ");
        System.out.println("=========================================");
        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Remainder of division (%)");
        System.out.println("6. Square root (√a)");
        System.out.println("7. Exponentiation(Powers)");
        System.out.print("Enter the operation number (1-7): ");

        int choice = scanner.nextInt();
        double a;
        double b;

        switch (choice){
            case 1:
                System.out.println("Enter 1st number: ");
                a = scanner.nextDouble();
                System.out.println("Enter 2nd number: ");
                b = scanner.nextDouble();

                System.out.printf("%.0f + %.0f = %.0f", a, b, a + b);
                break;
            case 2:
                System.out.println("Enter 1st number: ");
                a = scanner.nextDouble();
                System.out.println("Enter 2nd number: ");
                b = scanner.nextDouble();

                System.out.printf("%.0f - %.0f = %.0f", a, b, a - b);
                break;
            case 3:
                System.out.println("Enter 1st number: ");
                a = scanner.nextDouble();
                System.out.println("Enter 2nd number: ");
                b = scanner.nextDouble();

                System.out.printf("%.1f * %.1f = %.1f", a, b, a * b);
                break;
            case  4:
                System.out.println("Enter 1st number: ");
                a = scanner.nextDouble();
                System.out.println("Enter 2nd number: ");
                b = scanner.nextDouble();

                if (b == 0){
                    System.out.println("Error: Division by zero!");
                } else{
                    System.out.printf("%.1f / %.1f = %.1f", a, b, a / b);
                }
                break;
            case 5:
                System.out.println("Enter 1st number: ");
                a = scanner.nextDouble();
                System.out.println("Enter 2nd number: ");
                b = scanner.nextDouble();

                if(b == 0){
                    System.out.println("You cannot find a remainder when dividing by zero.");
                } else {
                    System.out.printf("%.1f %% %.1f = %.1f", a, b, a % b);
                }
                break;
            case 6:
                System.out.println("Enter number: ");
                a = scanner.nextDouble();
                 if (a < 0){
                     System.out.println("Error: Cannot calculate square root of a negative number!");
                 }else {
                     System.out.printf("√%.1f = %.1f", a, Math.sqrt(a));
                 }
                break;
            case 7:
                System.out.println("Enter base number: ");
                a = scanner.nextDouble();
                System.out.println("Enter exponent number: ");
                b = scanner.nextDouble();

                System.out.printf("%.1f  to the power of %.1f = %.1f", a, b, Math.pow(a, b));
                break;
            default:
                System.out.println("There is no such operation.");
        }

    }
}
