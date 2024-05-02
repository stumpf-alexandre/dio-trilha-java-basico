import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        /*analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

        selecaoCandidato();
        imprimirSelecionados();
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");
        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        else
            System.out.println("Não conseguimos contato com " + candidato + " número maximo de tentativas " + tentativasRealizadas);
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice de elementos");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de n° " + (i + 1) + " é o " +candidatos[i]);
        }

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidato() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JOÃO"};
        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatoSelecionado < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(String.format("O candidato %s solicitou este valor de salário R$%.2f",candidato, salarioPretendido));
            System.out.println(analisarCandidato(salarioPretendido));
            if (salarioBase > salarioPretendido){
             System.out.println("O candidato" + candidato + " foi selecionado para a vaga");
            candidatoSelecionado++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static String analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        String resultado = salarioBase > salarioPretendido ? "Ligar para o candidato" : salarioBase == salarioPretendido ? "Ligar para o candidato com contra proposta" : "Aguardando o resultado dos demais candidatos";
        return resultado;
    }
}
