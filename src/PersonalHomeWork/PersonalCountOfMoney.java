package PersonalHomeWork;

import java.math.BigDecimal;

public class PersonalCountOfMoney {

    public String type; //debit, credit
    public BigDecimal Balance;
    public String status;

    public PersonalCountOfMoney(String type, BigDecimal balance, String status) {
        this.type = type;
        this.Balance = balance;
        this.status = status;
    }

    public BigDecimal getBalance() {
        return Balance;
    }

    public void setBalance(BigDecimal balance) {
        this.Balance = balance;
    }
}