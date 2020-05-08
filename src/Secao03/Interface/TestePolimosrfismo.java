package Secao03.Interface;

public class TestePolimosrfismo {
    public static void main(String[] args) {
        Veiculo veiculo1, veiculo2, veiculo3;

        veiculo1 = new Veiculo(100, 2);
        veiculo2 = new Carro(120, 3, 5);
        veiculo3 = new Caminhao(70, 4, 200);

        veiculo1.mostrar();
        veiculo2.mostrar();
        veiculo3.mostrar();
    }
}
