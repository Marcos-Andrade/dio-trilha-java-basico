public class Usuario {
    public static void main(String[] args) throws Exception {

        Tv tv = new Tv();

        System.out.println("TV ligada? " + tv.ligada);
        System.out.println("Canal: " + tv.canal);
        System.out.println("Volume: " + tv.volume);

        tv.ligar();
        System.out.println("Novo Status -> TV ligada? " + tv.ligada);

        tv.desligar();
        System.out.println("Novo Status -> TV ligada? " + tv.ligada);

        tv.aumentarVolume();
        System.out.println("Novo Status -> Volume: " + tv.volume);

        tv.diminuirVolume();
        System.out.println("Novo Status -> Volume: " + tv.volume);

        System.out.println("Canal: " + tv.canal);
        tv.mudarCanal(10);
        System.out.println("Canal: " + tv.canal);

    }
}
