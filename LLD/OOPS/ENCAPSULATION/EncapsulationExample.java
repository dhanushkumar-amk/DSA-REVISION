package LLD.OOPS.ENCAPSULATION;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Proper setter for account number
    public void setAccountNumber(String accountNumber) {
        if (accountNumber.equals("7080")) {
            this.accountNumber = "90" + accountNumber;
        } else {
            this.accountNumber = accountNumber;
        }
    }

    // Proper setter for balance
    public void setBalance(double balance) {
        if (balance > 10000)
            this.balance = balance - 1000;
        else
            this.balance = balance + 1000;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12000.00, "7080");

        // Modify values using setters
        account.setAccountNumber(account.getAccountNumber());
        account.setBalance(account.getBalance());

        // Print updated values
        System.out.println("The account number is : " + account.getAccountNumber());
        System.out.println("The account balance is : " + account.getBalance());
    }
}
