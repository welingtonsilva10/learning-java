public class ContaTerminal {
    
    String nome = "";
    String sobrenome = "";
    int numero ;
    int agencia ;
    float saldo = 0;

    public void nomeCliente(String nomeCliente, String sobrenomeCliente){
        nome = nomeCliente;
        sobrenome = sobrenomeCliente;
    }
    public void dadosBancarios(int numeroDigitado, int agenciaDigitada){
        numero = numeroDigitado ;
        agencia = agenciaDigitada;
    }
    public void sacarSaldo(float valorSaque){
        saldo -= valorSaque;
    }
    public void depositarSaldo(float valorDeposito){
        saldo += valorDeposito;
    }
}
