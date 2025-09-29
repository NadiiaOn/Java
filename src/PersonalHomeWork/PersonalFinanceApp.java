package PersonalHomeWork;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;


public class PersonalFinanceApp {

    public static void run() {


        System.out.println(" =============== Hello! ==============  ");
        System.out.println("\n I am your personal-finance application!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Write your personal ID: ");
        Long personalIDHolder = scanner.nextLong();
        if (personalIDHolder > 99999999999L) {  //add template
            System.out.println("\n Thank you for your ID. ");
        } else {
            System.out.println("\n You need to write your ID number!(Correct personal ID has 12 figures).");
        }


        System.out.println("\n What is your full name? ");
        String accountHolderName = scanner.next();
        if (!accountHolderName.trim().isEmpty()) { //think about more input validation
            System.out.println("\n Hi, " + accountHolderName + "! \n I am happy to meet you!");
        } else {
            System.out.println("\n You need to write your full name...");
        }


        System.out.println("\n What is your phone number? ");
        Long accountHolderPhoneNumber = scanner.nextLong();

        if (accountHolderPhoneNumber > 999999999L) { //add template
            System.out.println("\n This is your number " + accountHolderPhoneNumber);
        } else {
            System.out.println("\n You need to write your phone number (Correct phone number has at least 10 figures).");
        }

        System.out.println("\n How old are you? ");
        Byte accountHolderAge = scanner.nextByte();

        if (accountHolderAge >= 18 && accountHolderAge <= 120) {
            System.out.println("\n You have the legal right to manage your account.");
        } else {
            System.out.println("\n You need to write your age.");
        }

        System.out.println("\n Write your account number: ");
        Long accountNumber = scanner.nextLong();

        if (accountNumber > 0) { //add template and input validation
            System.out.println("\n Thank you for using your account. ");
        } else {
            System.out.println("\n You need to write your account number.");
        }


        System.out.println("\n Write your account name: ");
        String accountName = scanner.next();

        if (!accountName.trim().isEmpty()) {
            System.out.println("\n Your account name is " + accountName + ".");
        } else {
            System.out.println("\n You need to write your account name.");
        }

        AccountHolder accountHolder = new AccountHolder(personalIDHolder, accountHolderName, accountHolderPhoneNumber, accountHolderAge);
        PersonalAccountOfMoney personalAccountOfMoney = new PersonalAccountOfMoney(accountName, accountNumber);
        Integer nextTransactionID = 1;

        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("\n Choose the number for further action: ");
            System.out.println("\t 1. Add a new transactions by yourself.");
            System.out.println("\t 2. Delete a transactions.");
            System.out.println("\t 3. View current account balance.");
            System.out.println("\t 4. View expense (annually, monthly, weekly and daily).");
            System.out.println("\t 5. View income (annually, monthly, weekly and daily).");
            System.out.println("\t 6. The information about the accountHolder.");


            int variants = keyboard.nextInt();
            switch (variants) {
                case 1:
                    System.out.println("Enter the amount of money you want to add: ");
                    BigDecimal amountForTheTransaction = keyboard.nextBigDecimal();
                    keyboard.nextLine();
                    System.out.println("Write the transactions type (income or expense): ");
                    String typeOfTransaction = keyboard.nextLine();

                    if (typeOfTransaction.equalsIgnoreCase("income") && amountForTheTransaction.compareTo(BigDecimal.ZERO) > 0) {
                        System.out.println("Enter the type of income: \n"
                                + " salary,\n"
                                + "interest from the investments,\n"
                                + "presents,\n"
                                + "scholarship,\n"
                                + "other income. ");
                        String incomeType = keyboard.nextLine();
                        Transaction transaction = new Transaction(nextTransactionID++, typeOfTransaction, amountForTheTransaction, LocalDate.now(), incomeType);
                        personalAccountOfMoney.addTransaction(transaction);


                    } else if (typeOfTransaction.equalsIgnoreCase("expense") && amountForTheTransaction.compareTo(BigDecimal.ZERO) > 0) {
                        System.out.println("Enter the type of expense: \n"
                                + "food,\n"
                                + "free time,\n"
                                + "car,\n"
                                + "savings,\n"
                                + "travel,\n"
                                + "other expenses.");
                        String expenseType = keyboard.nextLine();
                        Transaction transaction = new Transaction(nextTransactionID++, typeOfTransaction, amountForTheTransaction, LocalDate.now(), expenseType);
                        personalAccountOfMoney.addTransaction(transaction);

                    } else {
                        System.out.println("Invalid input. Please try again...");
                    }

                    break;

                case 2:
                    System.out.println("What transactions would you like to delete? ");
                    personalAccountOfMoney.viewTheListOfTransactions();
                    int transactionToDeleteID = keyboard.nextInt();
                    personalAccountOfMoney.removeTransaction(transactionToDeleteID);

                    break;

                case 3:
                    System.out.println("The current balance is " + personalAccountOfMoney.getAccountBalance());

                    break;

                case 4:
                    System.out.println("View expense: \n" +
                            "1. annually, \n" +
                            "2. monthly, \n" +
                            "3. weekly, \n" +
                            "4. daily.");
                    personalAccountOfMoney.viewExpense();

                    int periodOfExpense = keyboard.nextInt();
                    switch (periodOfExpense) {
                        case 1:
                            System.out.println("The expense yearly is ");
                            personalAccountOfMoney.viewStatisticsYearly("expense");
                            break;

                        case 2:
                            System.out.println("The expense monthly is ");
                            personalAccountOfMoney.viewStatisticsMonthly("expense");
                            break;

                        case 3:
                            System.out.println("The expense weekly is ");
                            personalAccountOfMoney.viewStatisticsWeekly("expense");
                            break;

                        case 4:
                            System.out.println("The expense daily is ");
                            personalAccountOfMoney.viewStatisticsDaily("expense");
                            break;
                    }

                    break;

                case 5:
                    System.out.println("View income: \n" +
                            "1. annually,\n " +
                            "2. monthly, \n" +
                            "3. weekly,\n " +
                            "4. daily.\n ");
                    personalAccountOfMoney.viewIncome();

                    int periodOfIncome = keyboard.nextInt();
                    switch (periodOfIncome) {
                        case 1:
                            System.out.println("The income annually is ");
                            personalAccountOfMoney.viewStatisticsYearly("income");
                            break;

                        case 2:
                            System.out.println("The income monthly is ");
                            personalAccountOfMoney.viewStatisticsMonthly("income");
                            break;

                        case 3:
                            System.out.println("The income weekly is ");
                            personalAccountOfMoney.viewStatisticsWeekly("income");
                            break;

                        case 4:
                            System.out.println("The income daily is ");
                            personalAccountOfMoney.viewStatisticsDaily("income");
                            break;
                    }

                    break;

                case 6:
                    System.out.println("Information about the accountholder.");
                    accountHolder.accountHolderInformation();

                    break;


                default:
                    System.out.println("Select an option");
                    
                    break;

            }
        }
    }

}











