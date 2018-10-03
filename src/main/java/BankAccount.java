import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {
    /**
     * Bank account types.
     */
    public enum BankAccountType {
        /** Checkings account. */
        CHECKINGS,
        /** Savings account. */
        SAVINGS,
        /** Student account. */
        STUDENT,
        /** Workplace account. */
        WORKPLACE
    }
    /** Account number. */
    private int accountNumber;
    /** Account type. */
    private BankAccountType accountType;
    /** Account balance. */
    private double accountBalance;
    /** Account owner name. */
    private String ownerName;
    /** Account interest rate. */
    private double interestRate;
    /** Account interest earned. */
    private double interestEarned;

    /**
     * Constuctor for BankAccount.
     * @param name name of account holder
     * @param accountCategory type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.accountType = accountCategory;
        this.ownerName = name;
    }
    /**
     * @return account num
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param setAccountNumber account num
     */
    public void setAccountNumber(final int setAccountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return account type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * @param setAccountType account type
     */
    public void setAccountType(final BankAccountType setAccountType) {
        this.accountType = accountType;
    }

    /**
     * @return account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param setAccountBalance account balanacr
     */
    public void setAccountBalance(final double setAccountBalance) {
        this.accountBalance = accountBalance;
    }
    /**
     * @return owner name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param setOwnerName owner name
     */
    public void setOwnerName(final String setOwnerName) {
        this.ownerName = ownerName;
    }

    /**
     * @return interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * @param setInterestRate interest rate
     */
    public void setInterestRate(final double setInterestRate) {
        this.interestRate = interestRate;
    }

    /**
     * @return interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * @param setInterestEarned interest earned
     */
    public void setInterestEarned(final double setInterestEarned) {
        this.interestEarned = interestEarned;
    }
}
