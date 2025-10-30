
// Experiment 4: Constructor Overloading
import java.util.Scanner;

class BankAccount {
    String ownerName;
    int accountNumber;
    double balance;
    String accountType;

    BankAccount() {
        ownerName = "Unknown";
        accountNumber = 0;
        balance = 0.0;
        accountType = "Savings";
    }

    BankAccount(String name, int accNo, double bal, String type) {
        ownerName = name;
        accountNumber = accNo;
        balance = bal;
        accountType = type;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    void display() {
        System.out.println("\n=== Account Details ===");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter owner name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();
        System.out.print("Enter account type (Savings/Current): ");
        String type = sc.next();
        BankAccount account = new BankAccount(name, accNo, bal, type);
        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double with = sc.nextDouble();
                    account.withdraw(with);
                    break;
                case 3:
                    account.display();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}