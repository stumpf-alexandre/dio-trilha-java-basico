import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class adoutMe {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = sc.next();
            System.out.println("Digite seu sobrenome");
            String sobrenome = sc.next();
            System.out.println("Digite sua idade");
            int idade = sc.nextInt();
            System.out.println("Digite sua altura");
            double altura = sc.nextDouble();

            System.out.println("Ola me chamo " + nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase() + " " + sobrenome.substring(0, 1).toUpperCase() + sobrenome.substring(1).toLowerCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.printf("Minha altura é %.2f cm", altura);
            sc.close();
        }catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
