package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        CurrencyConverter convert = new CurrencyConverter();
        System.out.println("Dolar price: ");
        convert.dolarPrice = entrada.nextDouble();
        System.out.println("Dolars that will be bought: ");
        convert.dolarBought = entrada.nextDouble();

        System.out.printf("Total amount: %.2f", convert.dolarConversion());

    }
}
