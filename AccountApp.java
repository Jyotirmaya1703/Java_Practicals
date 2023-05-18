
import java.util.Scanner;

abstract class Account {
    protected double interestRate;
    protected double amount;

    public Account(double amount) {
        this.amount = amount;
    }

    public abstract double calculateInterest(int days);
}

class FDAccount extends Account {
    private boolean seniorCitizen;
    private int days;

    public FDAccount(double amount, boolean seniorCitizen, int days) {
        super(amount);
        this.seniorCitizen = seniorCitizen;
        this.days = days;
        if (amount < 10000000) {
            interestRate = seniorCitizen ? 6.5 : 6.0;
        } else {
            interestRate = seniorCitizen ? 7.0 : 6.5;
        }
    }

    public double calculateInterest(int days) {
        return (amount * interestRate * days) / (36500);
    }
}

class RDAccount extends Account {
    private int months;
    private boolean seniorCitizen;

    public RDAccount(double amount, int months, boolean seniorCitizen) {
        super(amount);
        this.months = months;
        this.seniorCitizen = seniorCitizen;
        if (amount < 10000000) {
            interestRate = seniorCitizen ? 7.5 : 7.0;
        } else {
            interestRate = seniorCitizen ? 8.0 : 7.5;
        }
    }

    public double calculateInterest(int days) {
        double interest = 0;
        double monthlyAmount = amount / months;
        for (int i = 0; i < months; i++) {
            interest += (monthlyAmount * interestRate * days) / (36500);
        }
        return interest;
    }
}



public class AccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Create FD account");
            System.out.println("2. Create RD account");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createFDAccount(scanner);
                    break;
                case 2:
                    createRDAccount(scanner);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again");
                    break;
            }
        }
    }

    private static void createFDAccount(Scanner scanner) {
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        System.out.println("Enter number of days:");
        int days = scanner.nextInt();
        System.out.println("Is account holder a senior citizen? (y/n)");
        boolean seniorCitizen = scanner.next().equalsIgnoreCase("y");
        FDAccount fdAccount = new FDAccount(amount, seniorCitizen, days);
        double interest = fdAccount.calculateInterest(days);
        System.out.println("Interest earned: " + interest);
    }

    private static void createRDAccount(Scanner scanner) {
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        System.out.println("Enter number of months:");
        int months = scanner.nextInt();
        System.out.println("Is account holder a senior citizen? (y/n)");
        boolean seniorCitizen = scanner.next().equalsIgnoreCase("y");
        RDAccount rdAccount = new RDAccount(amount, months, seniorCitizen);
        double interest = rdAccount.calculateInterest(30);
        System.out.println("Interest earned: " + interest);
    }
}

