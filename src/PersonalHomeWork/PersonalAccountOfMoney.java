package PersonalHomeWork;

import java.math.BigDecimal;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.HashMap;

public class PersonalAccountOfMoney {

    private int accountID;
    private String accountName;
    private long accountNumber;
    private BigDecimal accountBalance;
    private ArrayList<Transaction> transactions;

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
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

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public PersonalAccountOfMoney(String accountName, long accountNumber) {
        this.accountID = 1;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = BigDecimal.ZERO;
        this.transactions = new ArrayList<>();
    }

    public void printCurrentBalance() {
        System.out.println("The current balance is " + accountBalance);
    }

    public void printExpense() {
        BigDecimal totalExpense = BigDecimal.ZERO;
        for (Transaction t : transactions) {
            if (t.getTransactionType().equals("expense")) {
                totalExpense = totalExpense.add(t.getAmount());
            }
        }
        System.out.println("The total expense is " + totalExpense);

    }

    public void printIncome() {
        BigDecimal totalIncome = BigDecimal.ZERO;
        for (Transaction t : transactions) {
            if (t.getTransactionType().equals("income")) {
                totalIncome = totalIncome.add(t.getAmount());
            }
        }
        System.out.println("The total income is " + totalIncome);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        if (transaction.getTransactionType().equalsIgnoreCase("income")) {
            accountBalance = accountBalance.add(transaction.getAmount());
        } else {
            accountBalance = accountBalance.subtract(transaction.getAmount());
        }
        System.out.println("Transaction added successfully. The transaction ID is " + transaction.getTransactionID());
    }

    public void removeTransaction(Integer transactionID) {
        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);

            if (transaction.getTransactionID().equals(transactionID)) {
                transactions.remove(transaction);
                if (transaction.getTransactionType().equalsIgnoreCase("income")) {
                    accountBalance = accountBalance.subtract(transaction.getAmount());
                } else {
                    accountBalance = accountBalance.add(transaction.getAmount());
                }
                System.out.println("Transaction deleted successfully." + transaction.getTransactionID());
                return;
            }
        }
        System.out.println("Transaction ID incorrect. Write the correct ID.");
    }

    public void printTheListOfTransactions() {
        for (Transaction t : transactions) {
            t.viewTransactionDetails();
        }
    }

    public void printStatisticsDaily(String transactionType) {

        HashMap<String, BigDecimal> statistics = new HashMap<>();

        for (Transaction transactionFilter : getTransactions()) {
            if (transactionFilter.getTransactionType().equalsIgnoreCase(transactionType)) {
                String transactionDate = transactionFilter.getDate().toString();

                BigDecimal amountOfThePeriod = statistics.get(transactionDate);
                if (amountOfThePeriod == null) {
                    amountOfThePeriod = BigDecimal.ZERO;
                }
                amountOfThePeriod = amountOfThePeriod.add(transactionFilter.getAmount());
                statistics.put(transactionDate, amountOfThePeriod);
            }
        }

        ArrayList<String> dates = new ArrayList<>(statistics.keySet());
        dates.sort(String::compareTo);
        for (String transactionDate : dates) {
            BigDecimal amountOfThePeriod = statistics.get(transactionDate);
            System.out.println(transactionDate + " - " + amountOfThePeriod.toString());
        }
    }

    public void printStatisticsMonthly(String transactionType) {

        HashMap<String, BigDecimal> statistics = new HashMap<>();

        for (Transaction transactionFilter : getTransactions()) {
            if (transactionFilter.getTransactionType().equalsIgnoreCase(transactionType)) {
                String transactionDate = transactionFilter.getDate().getYear() + "-" + transactionFilter.getDate().getMonthValue();

                BigDecimal amountOfThePeriod = statistics.get(transactionDate);
                if (amountOfThePeriod == null) {
                    amountOfThePeriod = BigDecimal.ZERO;
                }
                amountOfThePeriod = amountOfThePeriod.add(transactionFilter.getAmount());
                statistics.put(transactionDate, amountOfThePeriod);
            }
        }

        ArrayList<String> dates = new ArrayList<>(statistics.keySet());
        dates.sort(String::compareTo);
        for (String transactionDate : dates) {
            BigDecimal amountOfThePeriod = statistics.get(transactionDate);
            System.out.println(transactionDate + " - " + amountOfThePeriod.toString());
        }
    }

    public void printStatisticsYearly(String transactionType) {

        HashMap<String, BigDecimal> statistics = new HashMap<>();

        for (Transaction transactionFilter : getTransactions()) {
            if (transactionFilter.getTransactionType().equalsIgnoreCase(transactionType)) {
                String transactionDate = String.valueOf(transactionFilter.getDate().getYear());

                BigDecimal amountOfThePeriod = statistics.get(transactionDate);
                if (amountOfThePeriod == null) {
                    amountOfThePeriod = BigDecimal.ZERO;
                }
                amountOfThePeriod = amountOfThePeriod.add(transactionFilter.getAmount());
                statistics.put(transactionDate, amountOfThePeriod);
            }
        }

        ArrayList<String> dates = new ArrayList<>(statistics.keySet());
        dates.sort(String::compareTo);
        for (String transactionDate : dates) {
            BigDecimal amountOfThePeriod = statistics.get(transactionDate);
            System.out.println(transactionDate + " - " + amountOfThePeriod.toString());
        }
    }

    public void printStatisticsWeekly(String transactionType) {

        HashMap<String, BigDecimal> statistics = new HashMap<>();

        for (Transaction transactionFilter : getTransactions()) {
            if (transactionFilter.getTransactionType().equalsIgnoreCase(transactionType)) {
                String transactionDate = transactionFilter.getDate().getYear() + " " + transactionFilter.getDate().get(WeekFields.ISO.weekOfWeekBasedYear()) + "week";

                BigDecimal amountOfThePeriod = statistics.get(transactionDate);
                if (amountOfThePeriod == null) {
                    amountOfThePeriod = BigDecimal.ZERO;
                }
                amountOfThePeriod = amountOfThePeriod.add(transactionFilter.getAmount());
                statistics.put(transactionDate, amountOfThePeriod);
            }
        }

        ArrayList<String> dates = new ArrayList<>(statistics.keySet());
        dates.sort(String::compareTo);
        for (String transactionDate : dates) {
            BigDecimal amountOfThePeriod = statistics.get(transactionDate);
            System.out.println(transactionDate + " - " + amountOfThePeriod.toString());
        }
    }
}

