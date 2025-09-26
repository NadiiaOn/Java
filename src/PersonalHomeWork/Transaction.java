package PersonalHomeWork;

import java.math.BigDecimal;
import java.time.LocalDate;


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
        transaction.addTransaction(transaction);
        if (transaction.getTransactionType().equalsIgnoreCase("income")) {
            amount = amount.add(transaction.getAmount());
        } else {
            amount = amount.subtract(transaction.getAmount());
        }
        System.out.println("Transaction added successfully." + transaction.getTransactionID());

    }

    public void removeTransaction(Transaction transaction) {

        for (int i = 0; i < transaction.size(); i++) {
            int transactionID = transaction.getTransactionID(i);

            if (transaction.getTransactionID() == transactionID) {
                transaction.removeTransaction(transaction);
                System.out.println("Transaction deleted successfully." + transaction.getTransactionID());
            } else if (transaction.getTransactionID() != transactionID) {
                System.out.println("Transaction ID incorrect. Write the correct ID.");
            }
        }

        for (int transactionID : transaction) {
            System.out.println("Transaction removed successfully." + transaction.getTransactionID());
        }
        System.out.println("Transaction ID incorrect. Write the correct ID.");
    }


    public BigDecimal transitionsForTheDay() {
        System.out.println("The transitions for today (" + LocalDate.now() + ")" + "is: "); //end up expression efter is ...
        return amount;

    }
}
