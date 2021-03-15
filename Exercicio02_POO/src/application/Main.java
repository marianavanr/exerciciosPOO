package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Digite o nome, salário bruto e imposto: ");
        emp.name = entrada.nextLine();
        emp.grossSalary = entrada.nextDouble();
        emp.tax = entrada.nextDouble();

        System.out.println("Name: " + emp.name);
        System.out.println("Gross salary: " + emp.grossSalary);
        System.out.println("Tax: " + emp.tax);

        System.out.println("Which percentage to increase salary? ");
        double percentage = entrada.nextDouble();
        emp.IncreaseSalary(percentage);

        System.out.println("Update data: "+ emp);


    }
}
