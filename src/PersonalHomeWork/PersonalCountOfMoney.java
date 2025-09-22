package PersonalHomeWork;

import java.math.BigDecimal;

public class PersonalCountOfMoney {

    public String type; //debit, credit
    public BigDecimal balance;
    public String status;

    public PersonalCountOfMoney(String type, BigDecimal balance, String status) {
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
}