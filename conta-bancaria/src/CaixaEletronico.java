import java.util.Scanner;
import java.util.Locale;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Comece digitando seu nome: ");
        String nome = scanner.next();

        System.out.println("Agora digite seu sobrenome: ");
        String sobrenome = scanner.next();
        
        contaTerminal.nomeCliente(nome,sobrenome);
        
        System.out.println("Agora digite o numero da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Agora a agência: ");
        int agencia = scanner.nextInt();
        
        contaTerminal.dadosBancarios(numero, agencia);
        
        System.out.println("Olá, " + contaTerminal.nome + " " + contaTerminal.sobrenome + "!");
        System.out.println("Conta: " + contaTerminal.numero + " Agência " + contaTerminal.agencia);
        System.out.println("Seu saldo atual: " + contaTerminal.saldo);
        
        System.out.println("Realize um deposito na sua conta");
        float deposito = scanner.nextFloat();
        
        contaTerminal.depositarSaldo(deposito);
        
        System.out.println("Seu saldo atual: " + contaTerminal.saldo + "$");
        
        System.out.println("Realize um saque:");
        float saque = scanner.nextFloat();
        
        contaTerminal.sacarSaldo(saque);
        
        System.out.println("Seu saldo atual: " + contaTerminal.saldo);
    }
}
