public class Account {
    String customerName;
    String accountNumber;
    int balance = 0;
    int previousTransaction = 0;
    double interestRate = 0.0185;

    Account(String customerName, String accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            previousTransaction = amount;
            System.out.println("Deposited " + amount + " to " + customerName);
            System.out.println("Current balance is " + balance);
        } else {
            System.out.println("Please enter an amount greater than 0");
        }
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            if (amount > 0) {
                balance -= amount;
                previousTransaction = -amount;
                System.out.println("Withdrew " + amount + " from " + customerName);
                System.out.println("Current balance is " + balance);
            } else {
                System.out.println("Please enter an amount greater than 0");
            }
        } else {
            System.out.println("Insufficient funds");
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println(previousTransaction + " was deposited");
        } else if (previousTransaction < 0) {
            int temp = Math.abs(previousTransaction);
            System.out.println(temp + " was withdrawn");
        } else {
            System.out.println("No transaction occurred");
        }
    }

    void calculateInterest(int years) {
        double newBalance = balance + (balance * interestRate * years);

        System.out.println("The current interest rate is " + (interestRate * 100) + "%");
        System.out.println("After " + years + " years, your balance will be " + newBalance);
    }
}
