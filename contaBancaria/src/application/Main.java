package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Account account;

        System.out.println("Enter account number: ");
        int number = entrada.nextInt();
        System.out.println("Enter account holder: ");
        entrada.nextLine();
        String holder = entrada.nextLine();
        System.out.println("Is there an initial deposit (y/n)?");
        char response = entrada.next().charAt(0);

        if (response == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = entrada.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = entrada.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = entrada.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);
    }
}
