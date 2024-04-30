import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO:
        // Conhecer e importar a classe Scaner
        // Exibir as mensagens para o nosso usuário
        // Obter pela Scanner os valores digitados no terminal1
        Scanner sc = new Scanner(System.in);
        String numAgencia;
        do {
            System.out.println("Por favor, digite o número da agencia: ");
            numAgencia = sc.nextLine();
            if (numAgencia.length() <= 4 || numAgencia.length() > 5) {
                System.out.println("Agencia inexistente, digite um valor válido!!!");
            }
        } while (numAgencia.length() <= 4 || numAgencia.length() > 5);
        int numConta;
        String n;
        do {
            System.out.println("Por favor, digite o número da conta: ");
            numConta = sc.nextInt();
            n = Integer.toString(numConta);
            if (n.length() <= 3 || n.length() > 4) {
                System.out.println("Conta inexistente, digite um valor válido!!!");
            }
        } while (n.length() <= 3 || n.length() > 4);
        String nomeCliente;
        do {
            System.out.println("Por favor, digite o nome do usuário: ");
            nomeCliente = sc.next();
            if (nomeCliente.length() <= 2) {
                System.out.println("Nome de usuario inválido!!!");
            }
        } while (nomeCliente.length() <= 2);
        String saldo;
        do {
            System.out.println("Por favor, deposite um valor de no minimo R$100,00: ");
            saldo = sc.next();
            if (Float.parseFloat(saldo) <= (float) 99.99) {
                System.out.println("Saldo insuficiente.");
            }
        } while (Float.parseFloat(saldo) <= (float) 99.99);
        // Exibir a menssagem conta criada
        System.out.println("Conta criada");
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque",
                nomeCliente, numAgencia, numConta, Float.parseFloat(saldo));
    }
}