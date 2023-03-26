package exe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(10000); // 初始化ATM对象，初始余额为10000元
        int choice = 0;
        do {
            System.out.println("请选择服务：");
            System.out.println("1.查询余额");
            System.out.println("2.取款");
            System.out.println("3.存款");
            System.out.println("4.退出");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.println("请输入取款金额：");
                    double amount = scanner.nextDouble();
                    atm.withdraw(amount);
                    break;
                case 3:
                    System.out.println("请输入存款金额：");
                    double deposit = scanner.nextDouble();
                    atm.deposit(deposit);
                    break;
                case 4:
                    System.out.println("感谢您的使用，再见！");
                    break;
                default:
                    System.out.println("请输入正确的选项！");
            }
        } while (choice != 4);
    }
}