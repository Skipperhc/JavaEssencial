package JavaEssencialAndroid.ex2;

public class Caminhao extends Veiculo {
    private int capacidadeDeCarga;

    public Caminhao(int velocidade, int marcha, int capacidadeDeCarga) {
        super(velocidade, marcha);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void Acelerar(int incremento) {
        this.velocidade = (velocidade + incremento) - 10;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Caminhão: Capacidade de carga: " + this.capacidadeDeCarga);
    }
}
