import java.util.Scanner;

/**
 * Created by Серёжа on 19.03.2017.
 */

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a");
        int a = readInt(scanner);
        System.out.println("Введите число b");
        int b = readInt(scanner);
        int sum = a + b;
        System.out.println("a + b = " + sum);
        int sub = a - b;
        System.out.println("a - b = " + sub);
        int mul = a * b;
        System.out.println("a * b = " + mul);
        if (b != 0) {
            int del = a / b;
            System.out.println("a / b = " + del);
            double dell = a / b;
            System.out.println("a / b = " + dell);
            int delll = a % b;
            System.out.println("a / b = " + delll);
        } else {
            System.out.println("Деление на ноль невозможно");
        }

    }

    private static int readInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else
                System.out.println("Вы ввели не число");
            scanner.next();


        }
    }
}
