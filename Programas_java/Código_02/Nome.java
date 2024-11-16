package Programas_java.Código_02;

import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        // Instanciando o Scanner
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados na mesma linha
        System.out.print("Digite seu nome completo (nome e sobrenome): ");
        String nomeCompleto = teclado.nextLine(); // Lê toda a linha de entrada

        // Saída dos dados
        System.out.println("Seu nome é: " + nomeCompleto);

        // Fecha o Scanner para liberar recursos
        teclado.close();
    }
}
