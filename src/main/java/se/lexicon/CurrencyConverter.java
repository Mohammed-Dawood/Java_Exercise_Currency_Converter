package se.lexicon;

public class CurrencyConverter {

    // Exchange rates
    private static final double SEK_TO_USD = 0.11;
    private static final double SEK_TO_EUR = 0.095;
    private static final double USD_TO_SEK = 9.12;
    private static final double USD_TO_EUR = 0.87;
    private static final double EUR_TO_SEK = 10.53;
    private static final double EUR_TO_USD = 1.15;

    // Method to convert currency based on the user's choice
    public String convertCurrency(int choice, double amount) {
        double convertedAmount = 0.0;
        String targetCurrency = "";

        switch (choice) {
            case 1:
                convertedAmount = amount * SEK_TO_USD;
                targetCurrency = "USD";
                break;
            case 2:
                convertedAmount = amount * SEK_TO_EUR;
                targetCurrency = "EUR";
                break;
            case 3:
                convertedAmount = amount * USD_TO_SEK;
                targetCurrency = "SEK";
                break;
            case 4:
                convertedAmount = amount * USD_TO_EUR;
                targetCurrency = "EUR";
                break;
            case 5:
                convertedAmount = amount * EUR_TO_SEK;
                targetCurrency = "SEK";
                break;
            case 6:
                convertedAmount = amount * EUR_TO_USD;
                targetCurrency = "USD";
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        return String.format("Converted Amount: %.2f %s", convertedAmount, targetCurrency);
    }
}