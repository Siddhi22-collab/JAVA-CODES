import java.util.Scanner;

public class ATM {
    private double balance = 1000;

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Balance: $" + balance);
                case 2 -> {
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    balance += amount;
                    System.out.println("Deposited. New balance: $" + balance);
                }
                case 3 -> {
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    if (amount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= amount;
                        System.out.println("Withdrawn. New balance: $" + balance);
                    }
                }
                case 4 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    public static void main(String[] args) {
        new ATM().showMenu();
    }
}