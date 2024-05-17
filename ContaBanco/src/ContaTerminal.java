import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();     
        
        System.out.println("Digite o número da sua agencia: ");
        String agencia = scanner.next();  

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();  

        System.out.println("Digite o seu saldo: ");
        Double saldo = scanner.nextDouble();  

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco ");
        System.out.println("Sua agencia é " + agencia);
        System.out.println("Conta " + numeroConta);
        System.out.println("Eseu saldo de  " + saldo + " já está disponivél para saque !");
    }
}
