package PersonalHomeWork;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Transaction {
    private Integer transactionID;
    private String transactionType;
    private BigDecimal amount;
    private LocalDate date;
    private String description;

    public Transaction(Integer transactionID, String transactionType, BigDecimal amount, LocalDate date, String description) {
        this.transactionID = transactionID;
        this.transactionType = transactionType; // think about this I need it or not
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public Integer getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void viewTransactionDetails() {
        System.out.println(transactionID);
        System.out.println(transactionType);
        System.out.println(amount);
        System.out.println(date);
    }
}
