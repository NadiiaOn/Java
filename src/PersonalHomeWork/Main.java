package PersonalHomeWork;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" =============== Hello! ==============  ");
        System.out.println("\n I am your personal-finance application!");

       Scanner scanner = new Scanner(System.in);
        System.out.print("What is your full name? ");
        String name = scanner.nextLine();

        if (name != null && !name.trim().isEmpty()) {
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

        if (emailOfHolder.contains("@")) {
            System.out.println("\n Thank you for the information!");
        } else {
            System.out.println("\n You need to write your email address");
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("""
                \n Choose the number for further actions:
                1. Add a new transaction by yourself.
                2. Delete a transaction.
                3. View current account balance.
                4. View money some was spent (annually, monthly, weekly and daily).
                5. View income (annually, monthly, weekly and daily).
                6. Other action with the account.
                """);

        int variants = keyboard.nextInt();
        switch (variants) {
            case 1:
                System.out.println("Add a new transaction by yourself.");
                break;
            case 2:
                System.out.println("Delete a transaction.");
                break;
            case 3:
                System.out.println("View current account balance. ");
                break;
            case 4:
                System.out.println("View money some was spent (annually, monthly, weekly and daily)");
                break;
            case 5:
                System.out.println("View income (annually, monthly, weekly and daily).");
                break;
            default:
                System.out.println("Other action with the account.");
                break;
        }
        // разветвить свитч через while: if, else if to make the actions.
        //after that show again the list of action + possibilities to finish the whole process.
        // annually, monthly, weekly and daily choose throw the new switch ant than while: if, else if to make the actions.


       /* var accountHolder = new AccountHolder(name, phoneNumber, age, 0, "my address", emailOfHolder);
        accountHolder.personalAddress();
        System.out.println(accountHolder.getAge());
        exempel för mig
        */
    }
}
