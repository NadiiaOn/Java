package PersonalHomeWork;

import java.math.BigDecimal;

public class PersonalCountOfMoney {

    private Integer countID;
    private String countName;
    private BigDecimal countBalance;

    public PersonalCountOfMoney(Integer CountID, String countName, BigDecimal countBalance) {
        this.countID = CountID;
        this.countName = countName;
        this.countBalance = countBalance;
    }

    public BigDecimal getCountBalance() {
        return countBalance;
    }

    public void setCountBalance(BigDecimal countBalance) {
        this.countBalance = countBalance;
    }

    public void viewCurrentBalance() {
        System.out.println("The current balance is " + countBalance);
    }
}