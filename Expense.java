import java.util.Scanner;
import java.util.ArrayList;

public class Expense {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> expenses = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Calculate Total Expenses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense amount: ");
                    double amount = scanner.nextDouble();
                    expenses.add(amount);
                    break;
                case 2:
                    System.out.println("Expenses:");
                    for (double expense : expenses) {
                        System.out.println(expense);
                    }
                    break;
                case 3:
                    double total = 0;
                    for (double expense : expenses) {
                        total += expense;
                    }
                    System.out.println("Total Expenses: " + total);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}