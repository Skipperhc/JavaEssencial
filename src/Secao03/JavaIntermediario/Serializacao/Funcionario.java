package Secao03.JavaIntermediario.Serializacao;

import java.io.Serializable;

public class Funcionario implements Serializable {
     private String nome;
     private String endereco;
     private Cargo cargo;

    public Funcionario(String nome, String endereco, Cargo cargo) {
        this.nome = nome;
        this.endereco = endereco;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
