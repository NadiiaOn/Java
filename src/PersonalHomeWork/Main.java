package PersonalHomeWork;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PersonalFinanceApp.personalFinanceApp(args);

        ArrayList<Transaction> transactions = new ArrayList<>();
        Transaction transaction = new Transaction(1, "income", new BigDecimal(3000.00), LocalDate.of(2025,9,26) , "my first salary");
        transactions.add(transaction);
        transactions.remove(transaction);






/* var accountHolder = new AccountHolder(name, phoneNumber, age, 0, "my address", emailOfHolder);
        accountHolder.personalAddress();
        System.out.println(accountHolder.getAge());
        exempel för mig
        */

    }
}