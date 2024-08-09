// Programa cirado por Victhor gabriel
// Data: 09/08/2024

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        String nomeCliente = args[0];
        String agencia = args [1];
        int numero = Integer.valueOf(args[2]);
        double saldo = Double.valueOf(args[3]);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.next();
        System.out.println("por favor, digite o número da Agência: ");
        agencia = scanner.next();
        System.out.println("Sua conta: ");
        numero = scanner.nextInt();
        System.out.println("Seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " +  nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível  para saque");

        scanner.close();

    }
}
