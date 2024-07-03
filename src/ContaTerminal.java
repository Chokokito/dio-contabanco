import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo! Para começar, digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Por gentileza, digite o número da conta:");;
        int numeroConta = scanner.nextInt();
        System.out.println("Por gentileza, digite o número da Agência:");
        String numeroAgencia = scanner.next();
        System.out.println("Por gentileza, informe o valor do depósito:");
        Float deposito = scanner.nextFloat();

        System.out.println("Olá " + nome + " Obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$" + deposito + " reais, já está disponível para saque." );


      scanner.close();
    }
}
