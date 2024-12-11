package br.com.simoes;

import java.util.Scanner;

public class ConversaoWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê um valor numérico do console
        System.out.print("Digite um valor inteiro: ");
        int valorPrimitivo = scanner.nextInt();

        // Converte para o tipo wrapper
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        // Imprime os valores no console
        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor wrapper: " + valorWrapper);

        scanner.close();
    }
}
