import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account name:");
        String name = sc.nextLine();

        System.out.println("Enter account number:");
        String number = sc.nextLine();

        Account account = new Account(name, number);
    }
}
