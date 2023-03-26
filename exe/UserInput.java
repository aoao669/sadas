package exe;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static double getDoubleInput() {
        while (true) {
            try {
                System.out.print("请输入金额：");
                double input = scanner.nextDouble();
                scanner.nextLine();
                return input;
            } catch (Exception e) {
                System.out.println("输入无效，请重新输入！");
                scanner.nextLine();
            }
        }
    }

    public static int getIntInput() {
        while (true) {
            try {
                System.out.print("请输入整数：");
                int input = scanner.nextInt();
                scanner.nextLine();
                return input;
            } catch (Exception e) {
                System.out.println("输入无效，请重新输入！");
                scanner.nextLine();
            }
        }
    }
}