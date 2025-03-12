package org.jonas;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número de cliente!");
        String clientName = scanner.nextLine();

        System.out.println("Insira seu saldo");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque", clientName, agencia, num, saldo);
    }
}
