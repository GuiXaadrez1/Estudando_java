package Programas_java.Código_02;

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        // Materialização do objeto Scanner para leitura de dados
        Scanner teclado_num = new Scanner(System.in);
        /*
            * Para cada tipo de dado, vai ser necessário colocar um next comrrespondente a ele
        */
        // Declaração das variáveis
        System.out.print("Digite um número inteiro (a): ");
        int a = teclado_num.nextInt();  // Lê um inteiro
        System.out.print("Digite um número decimal (b): ");
        double b = teclado_num.nextDouble();  // Lê um número decimal

        // Realização do cálculo
        double resultado = a + b;  // O resultado será um double

        // Exibindo o resultado
        System.out.println("O valor do cálculo deu: " + resultado);

        // Fechando o Scanner para evitar vazamento de recursos
        teclado_num.close();
    }
}


