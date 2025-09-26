package PersonalHomeWork;

import java.math.BigDecimal;

public class PersonalAccountOfMoney {

    private Integer accountID;
    private String accountName;
    private Long accountNumber;
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

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }


    public PersonalAccountOfMoney(String accountName, Long accountNumber) {
        this.accountID = 1;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = BigDecimal.ZERO;
    }

    public void viewCurrentBalance() {
        System.out.println("The current balance is " + accountBalance);
    }

    public void addTransaction(BigDecimal amount) {
        accountBalance = accountBalance.add(amount);
    }

    public void subtractTransaction(BigDecimal amount) {
        accountBalance = accountBalance.subtract(amount);
    }

    public void viewExpense() {
        BigDecimal totalExpense = BigDecimal.ZERO;
        for (Transaction t : transactions) {
            if (t.getTransactionType().equals("expense")) {
                totalExpense = totalExpense.add(t.getAmount());
                System.out.println("The total expense is " + totalExpense);
            }
            else  {
                System.out.println("Wrong transaction type, please try again.");
            }
        }

    }
    public void viewIncome() {
        BigDecimal totalIncome = BigDecimal.ZERO;
        for (Transaction t : transactions) {
            if (t.getTransactionType().equals("income")) {
                totalIncome = totalIncome.add(t.getAmount());
                System.out.println("The total expense is " + totalIncome);
            }
            else  {
                System.out.println("Wrong transaction type, please try again.");
            }
        }

    }

}

