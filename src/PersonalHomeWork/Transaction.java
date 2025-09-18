package PersonalHomeWork;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    public Integer id;
    public String description;
    public BigDecimal amount;
    public LocalDate date;
    public String type; //"income" or "expense"

    public Transaction(Integer id, String description, BigDecimal amount, LocalDate date, String type) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.type = type;

        //write more methods for this class
    }

    public void checkTheAmmountOfMoney() {
        System.out.println("The amount of money on " + date + "is " + amount);
    }

    public BigDecimal transitionsForTheDay() {
        System.out.println("The transitions for today (" + date + ")" + "is:"); //end up expression efter is ...
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }
}
