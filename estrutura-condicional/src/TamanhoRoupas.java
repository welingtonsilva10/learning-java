public class TamanhoRoupas {
    
    public static void main(String[] args){
        String sigla = "B";

        switch (sigla) {
            case "A":{
                System.out.println("Tamanho grande");
                break;
            }
            case "B":{
                System.out.println("Tamanho pequeno");
                break;
            }
            default:{
                System.out.println("Tamanho não encontrado");
                break;
            }
        }
    }
}
