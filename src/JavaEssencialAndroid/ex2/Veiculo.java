package JavaEssencialAndroid.ex2;

public class Veiculo implements IVeiculo {
    int velocidade = 0;
    int marcha = 1;

    public Veiculo(int velocidade , int marcha) {
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

    @Override
    public void Acelerar(int incremento) {
        velocidade += incremento;
    }

    @Override
    public void Frear() {
        velocidade -= 10;
    }

    public void mostrar(){
        System.out.println("Velocidade: " + this.velocidade);
    }
}
