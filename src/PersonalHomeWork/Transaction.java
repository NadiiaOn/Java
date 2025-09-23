package PersonalHomeWork;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;



public class Transaction {
    private Integer transactionID;
    private String transactionType;
    private BigDecimal amount;
    private LocalDate date;
    private String description;

    public Transaction(int transactionID, String transactionType, BigDecimal amount, LocalDate date, String description) {
        this.transactionID = transactionID;
        this.transactionType = transactionType; // think about this I need it or not
        this.amount = amount;
        this.date = date;
        this.description = description;

        //write more methods for this class


    }

    public Integer getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Integer transactionID) {
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

    public void addTransaction(Transaction transaction) {
        Transaction newTransaction = new Transaction(transactionID++, transactionType, amount, LocalDate.now(), description);

        System.out.println("Transaction added successfully." + newTransaction);


    }
    /*public void checkTheAmmountOfMoney() {
        System.out.println("The amount of money on " + LocalDate + "is " + amount);
    }

    public BigDecimal transitionsForTheDay() {
        System.out.println("The transitions for today (" + LocalDate + ")" + "is: "); //end up expression efter is ...
        return amount;

     */


}
