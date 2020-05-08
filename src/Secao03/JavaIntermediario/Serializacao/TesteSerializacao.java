package Secao03.JavaIntermediario.Serializacao;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Vitor Hainosz", "Rua jose alceu", Cargo.BOSS);

        try {
            FileOutputStream fileOut = new FileOutputStream("E:/Projetos Git Java/JavaEssencial/src/Files/funcionario.ser");
            ObjectOutputStream outObj = new ObjectOutputStream(fileOut);
            outObj.writeObject(funcionario);
            outObj.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

