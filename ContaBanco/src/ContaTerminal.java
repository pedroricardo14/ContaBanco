import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        //Exibir as mensagens para o nosso usuário
        //Obter pelo scanner os valores digitados no terminal

        System.out.println("Por favor, digite o número da sua conta bancária: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite sua agência bancária: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome completo: ");
        String nomeCliente = scanner.next();

        float saldo = 237.48F;

        //Exibir a mensagem conta criada

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
