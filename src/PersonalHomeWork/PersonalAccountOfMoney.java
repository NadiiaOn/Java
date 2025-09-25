package PersonalHomeWork;

import java.math.BigDecimal;

public class PersonalAccountOfMoney {

    private Integer accountID;
    private String accountName;
    private Integer accountNumber;
    private BigDecimal accountBalance;

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }


    public PersonalAccountOfMoney(Integer accountID, String accountName, BigDecimal accountBalance) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void viewCurrentBalance() {
        System.out.println("The current balance is " + accountBalance);
    }

    public void  addTransaction(BigDecimal amount) {
        accountBalance = accountBalance.add(amount);
    }
    public void  subtractTransaction(BigDecimal amount) {
        accountBalance = accountBalance.subtract(amount);
    }


}