package Secao03.Interface;

public class Caminhao extends Veiculo {
    int capacidadeCarga;

    public Caminhao(int velocidade, int marcha, int capacidadeCarga) {
        super(velocidade, marcha);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void mostrar() {
        System.out.println("Caminhão");
        System.out.println("Capacidade de carga: " + this.capacidadeCarga);
        super.mostrar();
    }
}
