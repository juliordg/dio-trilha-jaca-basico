import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Para acesso a sua conta, informe os dados solicitados");
        System.out.printf("Nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Numero da Agencia: ");
        String agencia = scanner.next();

        System.out.println("Numero da Conta com digito: ");
        int conta = scanner.nextInt();

        double saldoInicial = 2537.16;

        System.out.println("| Titular da Conta |  " + nome + "    |");
        System.out.println("| Agencia: " + agencia + "   | Conta: " + conta + "   |");
        System.out.println("| Saldo disponivel: " + saldoInicial + "           |");

        System.out.println("Caso queira realizar um deposito digite: 1, se quiser encerrar digite: 2");
        int deposito = scanner.nextInt();

        if(deposito == 1) {
            System.out.println("Informe o valor a depositar: ");
            double somaSaldo = scanner.nextDouble();
            double saldoTotal = saldoInicial + somaSaldo;

        System.out.println("| Titular da Conta |  " + nome + "    |");
        System.out.println("| Agencia: " + agencia + "   | Conta: " + conta + "   |");
        System.out.println("| Saldo disponivel: " + saldoTotal + "           |");

        }else{
            System.out.println("Fim da consulta");
        }
    }
}
