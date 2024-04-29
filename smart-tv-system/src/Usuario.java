public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Estado: " + smartTv.ligada);
        System.out.println("canal: " + smartTv.canal);
        System.out.println("volume: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Estado: " + smartTv.ligada);
        
        smartTv.diminuirVolume();
        System.out.println("volume: " + smartTv.volume);
        
        smartTv.trocarCanal(25);
        System.out.println("Canal: " + smartTv.canal);

    }
}
