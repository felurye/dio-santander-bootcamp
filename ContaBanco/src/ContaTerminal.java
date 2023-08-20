import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        saldo = scanner.nextBigDecimal();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);
    }
}