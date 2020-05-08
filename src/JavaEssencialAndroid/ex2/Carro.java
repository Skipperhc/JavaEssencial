package JavaEssencialAndroid.ex2;

public class Carro extends Veiculo {

    int numLugares;

    public Carro(int velocidade, int marcha, int numLugares) {
        super(velocidade, marcha);
        this.numLugares = numLugares;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Carro: Lugares: " + this.numLugares);
    }
}
