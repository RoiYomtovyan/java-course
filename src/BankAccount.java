public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, int balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double withdraw (int exitMoney) {
        double newBalance= balance - exitMoney;
        if (newBalance < 0) {
           System.out.println(" you don't have enough money ");
        } else {
            balance = balance - exitMoney;
            System.out.println(" THE NEW BALANCE IS "+ balance);
        }

        return balance;
    }

    public double deposit (double incomingMoney) {
        if (incomingMoney < 0) {
            System.out.println("this is not valid incoming value");
        } else {
            balance= balance + incomingMoney;
            System.out.println(" THE NEW BALANCE IS "+ balance);
        }
        return balance;
    }
}
