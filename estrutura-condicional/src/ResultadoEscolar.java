public class ResultadoEscolar {
    
    public static void main(String[] args){
        int nota = 10;

        // Condicional composta e encadeada

        if(nota >= 6.5)
            System.out.println("Parabens, você está aprovado");

        else if(nota >=5 && nota <= 6.4)
            System.out.println("Você está de recuperação.");

        else
            System.out.println("Você foi reprovado.");
        
    }
}
