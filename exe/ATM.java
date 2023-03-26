package exe;

public class ATM {
    private double balance; // 余额

    // 构造方法，初始化余额
    public ATM(double balance) {
        this.balance = balance;
    }

    // 取款方法
    public void withdraw(double amount) {
        // 如果用户输入的金额大于余额，则无法取款
        if (amount > balance) {
            System.out.println("余额不足，无法取款！");
        } else {
            // 更新余额
            balance -= amount;
            System.out.println("取款成功，取款金额为：" + amount + "元，当前余额为：" + balance + "元。");
        }
    }

    // 查询余额方法
    public void queryBalance() {
        System.out.println("您当前的余额为：" + balance + "元。");
    }

    // 退出方法
    public void exit() {
        System.out.println("感谢您的使用，再见！");
    }
}