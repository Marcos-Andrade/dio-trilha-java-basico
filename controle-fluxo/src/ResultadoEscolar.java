public class ResultadoEscolar {
    public static void main(String[] args) {
        
        // Exemplo de estrutura condicional
        /*
        int nota = 6;

        if(nota >= 7) {
            System.out.println("Aprovado!");
        } 
        
        else if(nota >= 5 && nota < 7) {
            System.out.println("Recuperação!");
        } 
        
        else {
            System.out.println("Reprovado!");
        }
        */

        // Exemplo de estrutura de condicional ternária
        int nota = 6;  
        String resultado = (nota >= 7) ? "Aprovado!" : (nota >= 5 && nota < 7) ? "Recuperação!" : "Reprovado!";

        System.err.println(resultado);
    }
}
