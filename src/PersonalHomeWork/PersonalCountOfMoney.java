package PersonalHomeWork;

import java.math.BigDecimal;

public class PersonalCountOfMoney {

    private Integer CountID;
    private String type; //debit, credit
    private BigDecimal balance;
    private String status;

    public PersonalCountOfMoney(Integer CountID, String type, BigDecimal balance, String status) {
        this.CountID = CountID;
        this.type = type;
        this.balance = balance;
        this.status = status;


    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;

    }

    public void viewCurrentBalance() {
        System.out.println("The current balance is " + balance);
    }

    @Override
    public String toString() {
        return "PersonalCountOfMoney{" + "CountID=" + CountID + ", type='" + type + '\'' + ", balance=" + balance + ", status='" + status + '\'' + '}';
    }
}