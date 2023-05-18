import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Get user input for account type
            System.out.println("Enter account type (FD or RD):");
            String accountType = scanner.nextLine();

            // Get user input for account balance
            System.out.println("Enter account balance (in INR):");
            double balance = scanner.nextDouble();

            // Get user input for account holder age
            System.out.println("Enter account holder age (in years):");
            int age = scanner.nextInt();

            // Get user input for number of days
            System.out.println("Enter number of days:");
            int days = scanner.nextInt();

            // Determine interest rate based on account type, balance, and account holder age
            double rate;
            if (accountType.equalsIgnoreCase("FD")) {
                if (balance >= 10000000) { // greater than or equal to 1 crore
                    if (age >= 60) { // senior citizen
                        rate = 7.5;
                    } else { // general
                        rate = 6.5;
                    }
                } else { // less than 1 crore
                    if (age >= 60) {
                        rate = 7;
                    } else {
                        rate = 6;
                    }
                }
            } else if (accountType.equalsIgnoreCase("RD")) {
                if (balance >= 10000000) { // greater than or equal to 1 crore
                    if (age >= 60) { // senior citizen
                        rate = 6.75;
                    } else { // general
                        rate = 5.75;
                    }
                } else { // less than 1 crore
                    if (age >= 60) {
                        rate = 6.25;
                    } else {
                        rate = 5.25;
                    }
                }
            } else {
                System.out.println("Invalid account type");
                return;
            }

            // Calculate interest based on rate and number of days
            double interest = balance * rate / 100 * days / 365;

            // Print the interest amount
            System.out.println("Interest: INR " + interest);
        }
    }
    }

