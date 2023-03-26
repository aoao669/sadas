package exe;

import java.util.Scanner;

public class Validator {
    private Scanner scanner;

    public Validator() {
        this.scanner = new Scanner(System.in);
    }

    public int getValidInteger(String prompt) {
        int value = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("输入不合法，请重新输入！");
                scanner.next();
            }
        }
        return value;
    }

    public double getValidDouble(String prompt) {
        double value = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                isValid = true;
            } else {
                System.out.println("输入不合法，请重新输入！");
                scanner.next();
            }
        }
        return value;
    }
}