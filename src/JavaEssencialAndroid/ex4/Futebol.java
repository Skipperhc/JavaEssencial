package JavaEssencialAndroid.ex4;

public class Futebol {
    private int volume;
    private int peso;
    private Cor cor;
    private static String verdade;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public static String getVerdade() {
        return verdade;
    }

    public static void setVerdade(String verdade) {
        Futebol.verdade = verdade;
    }
}
