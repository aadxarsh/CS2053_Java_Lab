public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException(" Insufficient balance! Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println(" Withdrawal successful. Remaining balance: Rs." + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
