abstract class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void calculateInterest(); // abstract method

    void displayDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate = 0.05; // 5%

    SavingsAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Savings Account Interest: " + interest);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit = 10000;

    CurrentAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    void calculateInterest() {
        System.out.println("Current Account has no interest. Overdraft limit: " + overdraftLimit);
    }
}

public class Lab_4 {
    public static void main(String[] args) {
        // Polymorphism: parent reference, child object
        Account a1 = new SavingsAccount("SA101", 50000);
        Account a2 = new CurrentAccount("CA202", 30000);

        a1.displayDetails();
        a1.calculateInterest();

        System.out.println("------------------");

        a2.displayDetails();
        a2.calculateInterest();
    }
}
