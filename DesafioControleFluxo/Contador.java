package src.DesafiosProjetos.DesafioControleFluxo;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("\n--> Vamos verificar quantos números existem entre dois outros números.\n");
        System.out.println("-> Digite o primeiro número: ");
        int numeroUm = terminal.nextInt();
        System.out.println("-> Digite o segundo número: ");
        int numeroDois = terminal.nextInt();

        try {
            contar(numeroUm, numeroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
        terminal.close();
    }
    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        if(numeroUm > numeroDois){
            throw new ParametrosInvalidosException("O segundo parâmentro deve ser maior que o primeiro.");
        }

        int contagem = numeroDois - numeroUm;
        System.out.println("\n-> Quantidade de números entre os dois:\n");
        for(int i = 0; i <= contagem; i++){
            System.out.println(i);
        }
    }
}