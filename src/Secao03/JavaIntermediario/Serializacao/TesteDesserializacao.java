package Secao03.JavaIntermediario.Serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDesserializacao {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("E:/Projetos Git Java/JavaEssencial/src/Files/funcionario.ser");
            ObjectInputStream inObj = new ObjectInputStream(fileInput);
            Funcionario funcionario = (Funcionario) inObj.readObject();
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Endereço: " + funcionario.getEndereco());
            System.out.println("Cargo: " + funcionario.getCargo());
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
