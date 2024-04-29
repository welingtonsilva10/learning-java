public class Operators {
    public static void main(String[] args){

    }

    public static void boleana(String[] args){
        boolean condicao = true;
        boolean evento = false;

        if (condicao && evento){
            System.out.println("Tudo positivo");
        }
        if(condicao || evento){
            System.out.println("um deu certo");
        }
        if( (8>6) && (9>2) ){
            System.out.println("os numeros deram certo");
        }
        else{
            System.out.println("Deu ruim");
        }
    }
    public static void ternario(String[] args){
        int a,b;
        a = 7;
        b = 9;

        String resultado = "";

        if(a==b){
            resultado = "verdadeiro";
        }else{
            resultado = "falso";
        }

        System.out.println(resultado);
        
        resultado = a==b ? "verdadeiro" : "falso"; //A expressão deve ser boleana

        System.out.println(resultado);
    }

    public static void unarios(String[] args){
        int numero = 5;

        System.out.println(numero);
        
        numero = - numero;
        
        System.out.println(numero);
        
        numero = numero * -1;
        
        System.out.println(numero);
        
        numero++;
        
        System.out.println(numero);
    }
    public static void concatenacao(String[] args){
        String nomeCompleto = "Welington" + " " + "Silva";

        System.out.println(nomeCompleto);

        boolean variavel = true;

        System.out.println(variavel);

        System.out.println(!variavel); // invertendo valor da variavel em memoria
    }

} 
