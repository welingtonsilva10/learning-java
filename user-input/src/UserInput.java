import java.util.Locale;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu ultimo nome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        
        System.out.println("Ola, " + nome + " " + sobrenome + "! Você tem " + idade + " anos");

    }
}
