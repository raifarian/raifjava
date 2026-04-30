class Account {
    String accountHolder;
    long accountNumber;
    double balance;

    Account(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    void display() {
        System.out.println(accountHolder);
        System.out.println(accountNumber);
        System.out.println(balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Account a = new Account("Rahul", 1234567890L, 10000);
        a.deposit(5000);
        a.withdraw(3000);
        a.display();
    }
}