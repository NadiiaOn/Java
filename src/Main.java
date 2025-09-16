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
        System.out.println();
        System.out.println(" Hi " + kontoÄgare + "! \n I am happy to meet you!");
    }




}
