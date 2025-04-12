public class Operadores {
    public static void main(String[] args) {
        //EXEMPLO DE OPERADOR ARITMETICO
        String nomeCompleto = "Linguagem " + "JAVA";
        System.out.println(nomeCompleto);

        //-----------------------------------------------------------
        //EXEMPLO DE OPERADOR UNARIO
        int numero = 5;
        System.out.println(numero);

        numero++;
        System.out.println(numero);

        //----------------------------------------------------------
        //EXEMPLO DE OPERADOR UNARIO
        int a, b;

        a = 5;
        b = 6;

        /*EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);*/

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";
        System.out.println(resultado);

        //----------------------------------------------------------
        //EXEMPLO DE OPERADOR RELACIONAL

        int numero1 = 1;
        int numero2 = 2;
    
        if(numero1 > numero2){
            System.out.println("Numero 1 maior que numero 2");
        }
        if(numero1 < numero2){
            System.out.println("Numero 1 menor que numero 2");
        }
        if(numero1 >= numero2){
            System.out.println("Numero 1 maior ou igual que numero 2");
        }
        if(numero1 <= numero2){
            System.out.println("Numero 1 menor ou igual que numero 2");
        }
        if(numero1 != numero2){
            System.out.println("Numero 1 é diferente de numero 2");
        }


        //----------------------------------------------------------

        boolean condicao1= true;
        boolean condicao2= false;
        if(condicao1 && !condicao2){ // E E NÃO
            System.out.println("A condição 1 é verdadeira e a condição 2 é falsa");
        }
        if(condicao1 && condicao2){ // E
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){ // OU
            System.out.println("Pelo menos uma das condições é verdadeira");
        }

    }
}
