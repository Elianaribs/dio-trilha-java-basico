import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        //TODO: Conhecer e importar a classe Scanner

        var scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuários

        System.out.println("Por favor, digite o número da conta:");
        var account = scanner.nextInt();

        System.out.println("Agora digite a agência:");
        var agency = scanner.next();

        System.out.println("Informe seu nome:");
        var name = scanner.next();

        System.out.println("Para finalizarmos, digite seu saldo:");
        var bBalance = scanner.nextFloat();


        //Exibir a mensagem conta criada

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", name, agency, account, bBalance);
    }
}
