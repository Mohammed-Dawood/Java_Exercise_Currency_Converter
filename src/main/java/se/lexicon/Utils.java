package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Utils {

    // Method to get a valid amount from the user
    public static double getValidAmount(Scanner scanner) {
        double amount = -1;
        while (true) {
            System.out.print("Enter the amount to convert: ");
            try {
                amount = Double.parseDouble(scanner.nextLine());
                if (amount > 0) {
                    break;
                } else {
                    System.out.println("Amount must be positive. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
        return amount;
    }

    // Method to display the formatted output
    public static void displayFormattedOutput(String result) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println(result);
        System.out.println("Date and Time: " + formattedDateTime);
    }
}