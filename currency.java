import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Map<String, Double> exchangeRates = new HashMap<>();
        
        // Define fixed exchange rates (as of a specific date)
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.73);
        exchangeRates.put("JPY", 110.0);
        exchangeRates.put("CAD", 1.26);
        exchangeRates.put("AUD", 1.35);
        exchangeRates.put("CHF", 0.92);
        exchangeRates.put("CNY", 6.45);
        exchangeRates.put("INR", 74.0);
        exchangeRates.put("MXN", 19.95);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        
        System.out.print("Enter the source currency (e.g., USD): ");
        String sourceCurrency = scanner.next().toUpperCase();
        
        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.next().toUpperCase();
        
        if (exchangeRates.containsKey(sourceCurrency) && exchangeRates.containsKey(targetCurrency)) {
            double sourceRate = exchangeRates.get(sourceCurrency);
            double targetRate = exchangeRates.get(targetCurrency);
            
            double convertedAmount = (amount / sourceRate) * targetRate;
            
            System.out.println(amount + " " + sourceCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
        } else {
            System.out.println("Invalid currency codes entered.");
        }
        
        scanner.close();
    }
}
