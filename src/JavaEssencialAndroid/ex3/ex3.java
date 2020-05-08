package JavaEssencialAndroid.ex3;

import java.util.ArrayList;

public class ex3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add("Elemento: " + i);
        }
        for (String texto : list
        ) {
            System.out.println(texto);
        }
        System.out.println("Indice do Elemento 7: " + list.indexOf("Elemento: 7"));
        list.remove(4);
        System.out.println("Indice do Elemento 7: " + list.indexOf("Elemento: 7"));
    }
}
