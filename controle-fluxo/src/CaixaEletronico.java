public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25.00;
        double valorSolicitado = 27.00;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Valor solicitado maior que o saldo disponível!");
        }

    }
}
