abstract class Deposit {
    protected double principal;
    protected double interestRate;
    protected int time;

    public Deposit(double principal, double interestRate, int time) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.time = time;
    }

    public abstract double calculateInterest();
}

class FixedDeposit extends Deposit {
    private int tenure;

    public FixedDeposit(double principal, double interestRate, int time, int tenure) {
        super(principal, interestRate, time);
        this.tenure = tenure;
    }

    public double calculateInterest() {
        double interest = 0.0;
        double maturityAmount = 0.0;

        interest = principal * interestRate * time / 100.0;
        maturityAmount = principal + interest;

        return maturityAmount;
    }
}

class RecurringDeposit extends Deposit {
    private int monthlyInstallment;

    public RecurringDeposit(double principal, double interestRate, int time, int monthlyInstallment) {
        super(principal, interestRate, time);
        this.monthlyInstallment = monthlyInstallment;
    }

    public double calculateInterest() {
        double interest = 0.0;
        double maturityAmount = 0.0;

        interest = (principal * interestRate * time / 100.0) + (monthlyInstallment * time * (time + 1) / 2 * interestRate / 1200.0);
        maturityAmount = principal + interest;

        return maturityAmount;
    }
}

public class IntrestCal {
    public static void main(String[] args) {
        FixedDeposit fd = new FixedDeposit(10000.0, 5.0, 1, 1);
        RecurringDeposit rd = new RecurringDeposit(1000.0, 6.0, 12, 100);

        System.out.println("Fixed Deposit Maturity Amount: " + fd.calculateInterest());
        System.out.println("Recurring Deposit Maturity Amount: " + rd.calculateInterest());
    }
}