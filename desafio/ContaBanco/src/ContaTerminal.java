import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitando e lendo os dados do usuário
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta!");
        saldo = scanner.nextDouble();

        // Exibindo a mensagem final
        System.out.println("Olá " + nomeCliente + 
                         ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                         ", conta " + numero + 
                         " e seu saldo " + saldo + 
                         " já está disponível para saque");

        // Fechando o Scanner
        scanner.close();
    }
} 