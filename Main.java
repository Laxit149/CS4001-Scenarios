class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    public BankAccount(String accNum, String name, double initialBalance) {
        accountNumber = accNum;
        holderName = name;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance for " + holderName);
        }
    }

    public void displayBalance() {
        System.out.println("Account: " + accountNumber + " | Holder: " + holderName + " | Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("01", "ankit", 1000.0);
        BankAccount acc2 = new BankAccount("02", "aryan", 500.0);

        acc1.deposit(250.0);
        acc1.withdraw(100.0);

        acc2.deposit(100.0);
        acc2.withdraw(700.0);

        acc1.displayBalance();
        acc2.displayBalance();
    }
}