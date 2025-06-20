package src.DesafiosProjetos.ContaBanco;

import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String agencia = "067-8";
        String nome = "Mario Andrade";
        double saldo = 237.48;
        int numero = 1021;
        int numeroAgencia = 0;

        String saudacao = "---> Sejam todos Bem Vindos ao WHS - Bank! <---";
        System.out.println(saudacao);

        while(numeroAgencia != numero) {
            System.out.println("Por favor, digite o número da agência: ");
            numeroAgencia = scanner.nextInt();

            if (numeroAgencia != numero) {
                System.out.println("Agência Inválida. Tente novamente.");
            }
        }
        System.out.printf("Olá %s, obrigado por criar conta no WHS - Bank, sua agência é %s, conta %s e seu " +
                "saldo R$ %s já esta disponível para saque.", nome, agencia, numeroAgencia, saldo);
    }
}
