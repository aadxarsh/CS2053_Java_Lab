import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000); // Initial balance

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(" Transaction complete. Current balance: Rs." + account.getBalance());
        }

        sc.close();
    }
}
