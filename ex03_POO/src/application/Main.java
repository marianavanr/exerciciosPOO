package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Student std = new Student();

        System.out.println("Digite o nome do Aluno, seguido das 3 notas:");
        std.name = entrada.nextLine();
        std.av1 = entrada.nextDouble();
        std.av2 = entrada.nextDouble();
        std.av3 = entrada.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", std.finalGrade());

        if (std.finalGrade()<60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", std.missingPoints());
        } else{
            System.out.println("PASS");
        }

        entrada.close();
    }
}
