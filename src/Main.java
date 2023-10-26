import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonalAccount aruuke = new PersonalAccount(220104031, "Aruuke");

        System.out.println("Welcome, " + aruuke.getAccountHolder() + "! Your account number is #" + aruuke.getAccountNumber());

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Print Transaction History");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    aruuke.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    aruuke.withdraw(withdrawAmount);
                    break;
                case 3:
                    aruuke.printTransactionHistory();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
