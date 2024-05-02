public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;

        //condicional composta
        if(nota >= 7)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado");


        int nota2 = 6;

        //condicional encadeada
        if(nota2 >= 7)
            System.out.println("Aprovado");
    
        else if(nota2 >= 5 && nota < 7)
            System.out.println("Prova de recuperação");

        else
            System.out.println("Reprovado");


        //Condição ternária
        int nota3 = 7;

        String resultado = nota3 >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);


        int nota4 = 6;

        String resultado2 = nota4 >=7 ? "Aprovado" : nota4 >= 5 && nota4 < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);
    }
}
