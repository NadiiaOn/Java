package PersonalHomeWork;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalFinanceApp {
    private ArrayList<PersonalCountOfMoney> accounts;
    private ArrayList<Transactions> transactions;
    private int countID; //transactions counter

    public PersonalFinanceApp()

    {
        accounts = new ArrayList<>();
        transactions = new ArrayList<>();
        countID = 1;

    }

    public static void personalFinanceApp (String[] args) {

        System.out.println(" =============== Hello! ==============  ");
        System.out.println("\n I am your personal-finance application!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your full name? ");

        String name = scanner.nextLine();

        if (!name.trim().isEmpty()) {
            System.out.println("\n Hi, " + name + "! \n I am happy to meet you!");
        } else {
            System.out.println("\n You need to write your name...");
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("\n What is your phone number? ");

        Long phoneNumber = scanner2.nextLong();
        if (phoneNumber > 0) {
            System.out.println("\n This is your number " + phoneNumber);
        } else {
            System.out.println("\n You need to write your phone number");
        }

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("\n How old are you? ");
        Byte age = scanner3.nextByte();
        if (age >= 18 && age <= 120) {
            System.out.println("\n You have the legal right to manage your account. ");
        } else {
            System.out.println("\n You need to write your age");
        }

        Scanner scanner4 = new Scanner(System.in);
        System.out.print("\n Please, write your email address?");
        String emailOfHolder = scanner4.nextLine();

        if (emailOfHolder.contains("@") && emailOfHolder.contains(".")) {
            System.out.println("\n Thank you for the information!");
        } else {
            System.out.println("\n You need to write your email address");
        }
        // finish program if something went wrong before; try-catch


        Scanner keyboard = new Scanner(System.in);
        System.out.print("""
                \n Choose the number for further actions:
                1. Add a new transactions by yourself.
                2. Delete a transactions.
                3. View current account balance.
                4. View money some was spent (annually, monthly, weekly and daily).
                5. View income (annually, monthly, weekly and daily).
                6. Other action with the account.
                """);
        ArrayList<Transactions> transactionsList = new ArrayList<Transactions>();
        //transactionsList.add();
        //transactionList.remove(Transaction.getTransactionID());


        int variants = keyboard.nextInt();
        switch (variants) {
            case 1:
                System.out.println("Enter the amount of money you want to add: ");
                BigDecimal amount = keyboard.nextBigDecimal();
                keyboard.nextLine();
                System.out.println("Write the transactions type (income or expense): ");
                String transactionType = keyboard.nextLine();

                if (transactionType.equals("income") && amount.compareTo(BigDecimal.ZERO) > 0) {
                    System.out.println("Enter the type of income \n" + " SALARY,\n" + "    INTEREST_FROM_INVESTMENTS,\n" + "    PRESENTS,\n" + "    SCHOLARSHIP,\n" + "    OTHER_INCOME. ");
                    String incomeType = keyboard.nextLine();

                    // transactions.add(Transaction);

                } else if (transactionType.equals("expense") && amount.compareTo(BigDecimal.ZERO) > 0) {
                    System.out.println("Enter the type of expense \n" + "FOOD,\n" + "    FREE_TIME,\n" + "    CAR,\n" + "    SAVINGS,\n" + "    TRAVEL,\n" + "    OTHER_EXPENSE.");
                } else {
                    System.out.println("Invalid input. Please try again.");
                }

                String expenseType = keyboard.nextLine();
                // addTransaction method


                break;

            case 2:
                System.out.println();
                System.out.println("What transactions would you like to delete? ");
                //уточнить по чему человек хочет искать трасакцию по сумме, по дате, по ИД (для этого предварительно надо вывести все трансакции с указанием ИД)

                break;

            case 3:
                System.out.println("Current account balance is  ");
                //показывать только сумму баланса
                break;

            case 4:
                System.out.println("View money some was spent (annually, monthly, weekly and daily)");
                break;

            case 5:
                System.out.println("View income (annually, monthly, weekly and daily).");
                break;


            default:
                System.out.println("Select an option");
                break;

        }
    }

}
// разветвить свитч через while: if, else if to make the actions.
//after that show again the list of action + possibilities to finish the whole process.
// annually, monthly, weekly and daily choose throw the new switch ant than while: if, else if to make the actions.


       /* var accountHolder = new AccountHolder(name, phoneNumber, age, 0, "my address", emailOfHolder);
        accountHolder.personalAddress();
        System.out.println(accountHolder.getAge());
        exempel för mig
        */







