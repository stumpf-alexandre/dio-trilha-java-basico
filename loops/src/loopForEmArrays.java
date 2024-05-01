public class loopForEmArrays {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++) {
            int i = x;
            i = i + 1;
            System.out.println("O aluno do indice " + i + " é " + alunos[x]);
        }

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
