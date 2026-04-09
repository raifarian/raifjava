interface Bank {
    void bankName();
    void bankLocation();
}

// Customer class
class Customer {
    String customerName;
    int customerId;

    void setCustomerDetails(String name, int id) {
        customerName = name;
        customerId = id;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
    }
}

// Account class
class Account {
    int accountNumber;
    double balance;

    void setAccountDetails(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Main class (must be public)
public class BankSystem extends Customer implements Bank {

    Account acc = new Account();  // composition

    // Implement Bank interface
    public void bankName() {
        System.out.println("Bank Name: SBI");
    }

    public void bankLocation() {
        System.out.println("Location: Kolkata");
    }

    void displayAll() {
        bankName();
        bankLocation();
        displayCustomer();
        acc.displayAccount();
    }

    public static void main(String[] args) {
        BankSystem obj = new BankSystem();

        obj.setCustomerDetails("Rahul", 101);
        obj.acc.setAccountDetails(12345, 50000);

        obj.displayAll();
    }
}