public class Account {
    String customerName;
    String accountNumber;
    int balance = 0;
    int previousTransaction = 0;

    Account(String customerName, String accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }
}
