package Secao03.Interface;

public class Carro extends Veiculo {
    int numeroLugares;

    public Carro(int velocidade, int marcha, int numeroLugares) {
        super(velocidade, marcha);
        this.numeroLugares = numeroLugares;
    }

    public Carro(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }

    public int getNumeroLugares() {
        return numeroLugares;
    }

    public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }

    //overriding, sobre escrevi o metodo mostrar da classe pai
    @Override
    public void mostrar() {
        System.out.println("Carro");
        System.out.println("Lugares: " + this.numeroLugares);
        super.mostrar();
    }
}
