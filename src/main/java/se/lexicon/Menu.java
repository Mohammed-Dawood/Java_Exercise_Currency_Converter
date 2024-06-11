package se.lexicon;

import java.util.Scanner;

public class Menu {

    private final CurrencyConverter converter;
    private final Scanner scanner;

    public Menu() {
        this.converter = new CurrencyConverter();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int choice = 0;

        while (choice != 7) {
            displayMenu();
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 7) {
                    System.out.println("Invalid choice. Please choose a number between 1 and 7.");
                    continue;
                }

                if (choice != 7) {
                    double amount = Utils.getValidAmount(scanner);

                    if (amount <= 0) {
                        System.out.println("Amount cannot be zero or negative. Please try again.");
                        continue;
                    }

                    String result = converter.convertCurrency(choice, amount);
                    Utils.displayFormattedOutput(result);
                } else {
                    System.out.println("Exiting the application. Goodbye!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }

        scanner.close();
    }

    // Method to display the menu
    public void displayMenu() {
        System.out.println("Welcome to the Currency Converter App");
        System.out.println("Please choose an option:");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert SEK to Euro");
        System.out.println("3. Convert USD to SEK");
        System.out.println("4. Convert USD to Euro");
        System.out.println("5. Convert Euro to SEK");
        System.out.println("6. Convert Euro to USD");
        System.out.println("7. Exit");
    }
}