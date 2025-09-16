import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" =============== Hello! ==============  ");
        System.out.println();
        System.out.println("I am your personal-finance application!");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your full name? ");

        String kontoÄgare = scanner.nextLine();
        if (kontoÄgare != null  && ! kontoÄgare.trim().isEmpty()) {
            System.out.println();
            System.out.println(" Hi " + kontoÄgare + "! \n I am happy to meet you!");
        }
        else{
            System.out.println();
            System.out.println("You need to write your name...");
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println();
        System.out.print("What is your phone number? ");

        Long phoneNumber = scanner2.nextLong();
        if (phoneNumber>0 ) {
            System.out.println();
            System.out.println(" This is your number " + phoneNumber);
        }
        else{
            System.out.println();
            System.out.println("You need to write your phone number");
        }

        Scanner scanner3 = new Scanner(System.in);
        System.out.println();
        System.out.print("How old are you? ");

        Byte age = scanner3.nextByte();
        if (age >= 18 && age <=120 ) {
            System.out.println();
            System.out.println("You have the legal right to manage your account. ");
        }
        else{
            System.out.println();
            System.out.println("You need to write your age");
        }

        Scanner scanner4 = new Scanner(System.in);
        System.out.println();
        System.out.print("Please, write your email address?");

        String emailOfÄgare = scanner4.nextLine();
        if (!emailOfÄgare.isEmpty()&& emailOfÄgare.contains("@")) {
            System.out.println();
            System.out.println("Thank you for the information!");
        }
        else{
            System.out.println();
            System.out.println("You need to write your email address");
        }
        System.out.println("What do you want to do further?");
    }
class ChoiceSwitch {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Choose the number for further actions: \n 1. Make a new account. \n 2. Change information in a current account. \n 3. Take the information from the current account. \n 4. Put the money into your account. \n 5. Take the money from your account. \n 6. Other action with the account.");


        int variants = keyboard.nextInt();
        switch (variants){
            case 1:
                System.out.println("Make a new account.");
                break;
            case 2:
                System.out.println("Change information in a current account.");
                break;
            case 3:
                System.out.println("Take the information from the current account.");
                break;
            case 4:
                System.out.println("Put money into your account.");
                break;
            case 5:
                System.out.println("Take the money from your account.");
                break;
            default:
                System.out.println("Other action with the account.");
                break;
        }
    }
}





}
