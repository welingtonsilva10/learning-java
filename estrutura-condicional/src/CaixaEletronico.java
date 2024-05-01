public class CaixaEletronico {
    public static void main(String[] args){
        double saldo = 250.82;
        double valorSolicitado = 250.80;

        //Exemplo de uma condicional simples.

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
            
            System.out.println(saldo);
        }
        else{
            System.out.println("O valor solicitado não esta disponivel");
            System.out.println("Saldo disponivel: " + saldo);
        }
    }
}
