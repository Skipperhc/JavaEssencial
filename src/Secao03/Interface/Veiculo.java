package Secao03.Interface;

import Secao03.Interface.IVeiculo;

public class Veiculo implements IVeiculo {
    int velocidade = 0;
    int marcha = 1;


    //overloading
    public Veiculo(int velocidade, int marcha) {
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

    //overloading
    public Veiculo() {
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    @Override
    public void trocaMarcha(int novaMarcha) {

    }

    //overloading coloquei dois metodos com o mesmo nome mas diferentes parametros
    @Override
    public void acelerar(int incremento) {
        velocidade += incremento;
    }

    //overloading coloquei dois metodos com o mesmo nome mas diferentes parametros
    public void acelerar(int incremento, int marcha){
        velocidade = (velocidade + incremento) * marcha;
    }
    public void mostrar() {
        System.out.println("Velocidade: " + getVelocidade() + " Marcha: " + getMarcha());
    }
}
