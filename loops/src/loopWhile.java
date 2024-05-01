import java.util.concurrent.ThreadLocalRandom;

public class loopWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int i = 0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            i++;
            System.out.printf("%d° doce no valor: R$%,.2f, adicionado no carrinho\n", i, valorDoce);
            mesada = mesada - valorDoce;
        }
        System.out.printf("Mesada R$%,.2f\n", mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
