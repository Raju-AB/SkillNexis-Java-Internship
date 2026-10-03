import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 1000.0;

        System.out.println("===== BANK MANAGEMENT SYSTEM =====");

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful!");
                        System.out.println("Updated balance: " + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful!");
                        System.out.println("Remaining balance: " + balance);
                    }
                    break;

                case 3:
                    System.out.println("Current balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for banking with us!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
