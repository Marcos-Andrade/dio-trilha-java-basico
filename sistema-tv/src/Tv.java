public class Tv {
    boolean ligada = false;
    int canal = 1;
    int volume = 5;

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

}
