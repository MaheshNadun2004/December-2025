import java.util.Scanner;
class BankAccount {
    double currentBalance;
    BankAccount(double balance) {
        currentBalance = balance;
    }
    void deposit(double amount) {
        currentBalance += amount;
        System.out.println("Balance after deposit: " + currentBalance);
    }
    void withdraw(double amount) {
        if (amount > currentBalance) {
            System.out.println("Insufficient balance");
        } else {
            currentBalance -= amount;
            System.out.println("Balance after withdrawal: " + currentBalance);
        }
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    void withdraw(double amount) {
        double fee = 50;   // withdrawal fee
        double total = amount + fee;

        if (total > currentBalance) {
            System.out.println("Insufficient balance");
        } else {
            currentBalance -= total;
            System.out.println("Savings Account Balance: " + currentBalance);
        }
    }

    @Override
    void deposit(double amount) {
        currentBalance += amount;
        System.out.println("Savings Account Balance: " + currentBalance);
    }
}

class CheckingAccount extends BankAccount {

    CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        double limit = 20000; // withdrawal limit

        if (amount > limit) {
            System.out.println("Withdrawal limit exceeded");
        } else if (amount > currentBalance) {
            System.out.println("Insufficient balance");
        } else {
            currentBalance -= amount;
            System.out.println("Checking Account Balance: " + currentBalance);
        }
    }
    @Override
    void deposit(double amount) {
        currentBalance += amount;
        System.out.println("Checking Account Balance: " + currentBalance);
    }
}

public class Assignment2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Assign current balance (condition a)
        BankAccount acc = new SavingsAccount(10000);

        // Deposit (condition c)
        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        // Withdraw (condition b)
        System.out.print("Enter withdrawal amount: ");
        double wit = sc.nextDouble();
        acc.withdraw(wit);

        sc.close();
    }
}
