public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        //condicional simples
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(String.format("Novo saldo R$%,.2f", saldo));
        }
    }
}
