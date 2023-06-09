import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 150.00;

        System.out.println("\n-------- SEJA BEM VINDO AO WenBank--------\n\n");

        System.out.println("Qual seu nome? ");
            nomeCliente = scanner.next();

        System.out.println("-----------");

        System.out.println("Por favor digite o numero de sua Agencia: ");
            agencia = scanner.next();

        System.out.println("-----------");

        System.out.println("Qual a sua conta? ");
            numero = scanner.nextInt();

        System.out.println("-----------");

        System.out.println("seja bem vindo " + nomeCliente);

        System.out.println("-----------");

        System.out.println(nomeCliente + " obrigado por entrar em nosso banco \n" +
                "sua agencia e: " + agencia + "\nO numero de sua conta e: " + numero + "\nSeu valor para saque e: " +
                 saldo);






    }
}
