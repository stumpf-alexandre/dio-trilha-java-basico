import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro do contador: ");
        int parametro1 = sc.nextInt();
        System.out.println("Digite o segundo parametro do contador: ");
        int parametro2 = sc.nextInt();

        try {
            contar(parametro1, parametro2);
            sc.close();
        } catch (ParametrosInvalidosException e) {
            System.out.println("O parametro 2 não pode ser menor que o parametro 1");
        }
    }

    static void contar(int par1, int par2) throws ParametrosInvalidosException {
        if (par1 > par2) {
            throw new ParametrosInvalidosException();
        }else {
            int contador = par2 - par1;
            System.out.println("O contador irá fazer " + contador + " interações");
            for (int i = 0; i < contador; i++) {
                System.out.println("Número " + (i + 1));
            }
        }
    }
}
