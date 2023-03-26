package exe;

public class Amount {
    private double amount;

    public Amount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(BankAccount account) {
        double balance = account.getBalance();
        balance += amount;
        account.setBalance(balance);
        System.out.println("存款成功，存款金额为：" + amount + "元，当前余额为：" + balance + "元。");
        System.out.println("余额：" + numToChinese((int)balance));
    }

    public void withdraw(BankAccount account) {
        double balance = account.getBalance();

        // 如果用户输入的金额大于余额，则无法取款
        if (amount > balance) {
            System.out.println("余额不足，无法取款！");
        } else {
            // 更新余额
            balance -= amount;
            account.setBalance(balance);
            System.out.println("取款成功，取款金额为：" + amount + "元，当前余额为：" + balance + "元。");
            System.out.println("余额：" + numToChinese((int)balance));
        }
    }

    private String numToChinese(int num) {
        //将数字转换成中文大写
        String[] chineseNums = {"零","壹","貳","叁","肆","伍","陸","柒","捌","玖"};
        String[] chineseUnits = {"","拾","佰","仟","萬","億","兆"};
        String chineseStr = "";
        int unitPos = 0;
        boolean needZero = false;
        while(num > 0){           int digit = num % 10;
            if(digit == 0){
                if(needZero){
                    chineseStr = chineseNums[0] + chineseStr;}
                needZero = true;
                   }else{
                chineseStr = chineseNums[digit] + chineseUnits[unitPos] + chineseStr;
                needZero = false;
                   }
                  unitPos++;
                   num /= 10;
              }
              return chineseStr;
    }
}