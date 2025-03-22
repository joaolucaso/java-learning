package iExcecoes;

import java.io.File;

public class excecoes {
    public static void main(String[] args) {

        try {

            int resultado = 10 / 0;
            System.out.println("resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
        System.out.println("O programa continua executando.");


    }
}
